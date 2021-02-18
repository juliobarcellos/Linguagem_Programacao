package Sistema_Votacao;

import java.util.Random;
import javax.swing.*;
import java.io.*;

public class Metodos {
	int Vtsecao[] = new int[11];
	int VtCand[] = new int[31];
	int VtClas[] = new int[31];
	int ClasCand[] = new int[31];
	Random r = new Random();
	Principal MenuPrincipal = new Principal();

	Votacao2019[] FCadastraVotacao(Votacao2019[] votacao) {
		int Cont, Cont1, Cont2, Aux1, Aux2;
		for (Cont = 0; Cont < 100; Cont++) {
			votacao[Cont] = new Votacao2019();
		}
		for (Cont = 0; Cont < 100; Cont++) {
			votacao[Cont].NumeroCandidato = r.nextInt(31);
			VtCand[votacao[Cont].NumeroCandidato]++;
			VtClas[votacao[Cont].NumeroCandidato]++;
			votacao[Cont].NumeroSecao = r.nextInt(11);
			Vtsecao[votacao[Cont].NumeroSecao]++;
		}
		for (Cont = 0; Cont < 31; Cont++) {
			ClasCand[Cont] = Cont;
		}
		for (Cont1 = 0; Cont1 < 30; Cont1++) {
			for (Cont2 = Cont1 + 1; Cont2 < 31; Cont2++) {
				if (VtClas[Cont1] < VtClas[Cont2]) {
					Aux1 = ClasCand[Cont1];
					ClasCand[Cont1] = ClasCand[Cont2];
					ClasCand[Cont2] = Aux1;
					Aux2 = VtClas[Cont1];
					VtClas[Cont1] = VtClas[Cont2];
					VtClas[Cont2] = Aux2;
				}
			}
		}
		return votacao;
	}

	Votacao2019[] FClassificaSecao(Votacao2019[] votacao) {
		int Cont1, Cont2;
		Votacao2019[] aux = new Votacao2019[1];
		for (Cont1 = 0; Cont1 < 99; Cont1++) {
			for (Cont2 = Cont1 + 1; Cont2 < 100; Cont2++) {
				if (votacao[Cont1].NumeroSecao > votacao[Cont2].NumeroSecao) {
					aux[0] = votacao[Cont1];
					votacao[Cont1] = votacao[Cont2];
					votacao[Cont2] = aux[0];
				}
			}
		}
		return votacao;
	}

	Votacao2019[] FGravaVotacao(Votacao2019[] votacao) throws IOException {
		String Arquivo = "Votacao2019.txt";
		int Cont;
		BufferedWriter writer = new BufferedWriter(new FileWriter(Arquivo));
		for (Cont = 0; Cont < 100; Cont++) {
			writer.write(Integer.toString(votacao[Cont].NumeroCandidato));
			writer.newLine();
			writer.write(Integer.toString(votacao[Cont].NumeroSecao));
			writer.newLine();
		}
		writer.close();
		return votacao;
	}

	void MostrarIndicadores() throws IOException {
		int Opc2, Cont, Min = 0, Max = 0;
		do {
			Opc2 = Integer.parseInt(JOptionPane.showInputDialog(
					"Estatisticas de Votação 2019\n1- Quantidade de eleitores por Seção\n2- Seção com Maior e Menor número de Eleitores\n3- Quantidade de votos por candidato\n4- 10 Primeiros Colocados\n9- Finaliza consulta"));
			switch (Opc2) {
			case 1:
				String Exibir = "";
				for (Cont = 0; Cont < 11; Cont++) {
					Exibir += ("Quantidade de eleitores na seção " + Cont + "= " + Vtsecao[Cont] + "\n");
				}
				JOptionPane.showMessageDialog(null, Exibir);
				break;
			case 2:
				for (Cont = 0; Cont < 11; Cont++) {
					if (Min == 0 && Max == 0) {
						Min = Cont;
						Max = Cont;
					} else if (Vtsecao[Cont] < Vtsecao[Min]) {
						Min = Cont;
					} else if (Vtsecao[Cont] > Vtsecao[Max]) {
						Max = Cont;
					}
				}
				if (Vtsecao[0] < Vtsecao[Min]) {
					Min = 0;
				} else if (Vtsecao[0] > Vtsecao[Max]) {
					Max = 0;
				}
				JOptionPane.showMessageDialog(null,
						"Seção com menor número de votos: " + Min + "\nQuantidade de eleitores na seção: "
								+ Vtsecao[Min] + "\n\nSeção com o maior número de eleitores: " + Max
								+ "\nQuantidade de eleitores na seção: " + Vtsecao[Max]);
				break;
			case 3:
				for (Cont = 0; Cont < 31; Cont++) {
					System.out.println("Votos do candidato " + Cont + "= " + VtCand[Cont]);
				}
				break;
			case 4:
				String Cand10 = "";
				for (Cont = 0; Cont < 10; Cont++) {
					Cand10 += ("Candidato na posição " + (Cont + 1) + "= " + ClasCand[Cont] + ", com a quantidade de "
							+ VtCand[ClasCand[Cont]] + " votos\n");
				}
				JOptionPane.showMessageDialog(null, "10 primeiros candidatos e quantidade de votos:\n" + Cand10);
				break;
			case 9:

				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
			}
		} while (Opc2 != 9);
	}
}
