package Sistema_Transito;

import javax.swing.*;
import java.util.Random;

public class Metodos {
	MenuEstatistica MenuPrincipal = new MenuEstatistica();
	int Min = 0, Max = 0;
	double Med = 0;
	Random r = new Random();
	String Cidades[] = { "Amparo", "Barretos", "Campinas", "Diadema", "Embu" };
	char c = (char) (r.nextInt(5) + 'a');

	public Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] estatistica) {
		int Cont;
		for (Cont = 0; Cont < 15; Cont++)
			estatistica[Cont] = new Estatistica();

		for (Cont = 0; Cont < 15; Cont++) {
			estatistica[Cont].Nome_Cidade = Cidades[(r.nextInt(5))]; // JOptionPane.showInputDialog("Entre com o nome da
																		// cidade: ");
			estatistica[Cont].Cod_Cidade = (r.nextInt(5));// Integer.parseInt(JOptionPane.showInputDialog("Entre o
															// código da cidade:"));
			estatistica[Cont].Qtd_Acidentes = (r.nextInt(800 - 15) + 15);// Integer.parseInt(JOptionPane.showInputDialog("Entre
																			// a quantidade de acidentes:"));
			estatistica[Cont].Tipo_Veiculo = (r.nextInt(5 - 1) + 1);// Integer.parseInt(JOptionPane.showInputDialog("Entre
																	// o tipo do veículo:"));
			if ((Min == 0) && (Max == 0)) {
				Min = estatistica[Cont].Qtd_Acidentes;
				Max = estatistica[Cont].Qtd_Acidentes;
			} else if (estatistica[Cont].Qtd_Acidentes < Min) {
				Min = estatistica[Cont].Qtd_Acidentes;
			} else if (estatistica[Cont].Qtd_Acidentes > Max) {
				Max = estatistica[Cont].Qtd_Acidentes;
			}
			Med += estatistica[Cont].Qtd_Acidentes;
		}
		Med = (Med / 15);
		return estatistica;
	}

	void PTIPO(Estatistica[] estatistica) {
		int Cont = 0, Opc = 0;
		String Acidentes = "Nome Cidade: / Cód Cidade: / Qtd Acidentes: / Tipo Veículo:\n";

		do
			Opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Pesquisa de acidentes por tipo de veículo:\n\nDigite o tipo de veículo desejado na pesquisa:\n1-Ônibus\n2-Carros\n3-Motos\n4-Caminhões"));
		while ((Opc < 1) || (Opc > 4));
		for (Cont = 0; Cont < 15; Cont++) {
			if (estatistica[Cont].Tipo_Veiculo == Opc) {
				Acidentes += (estatistica[Cont].Nome_Cidade + "                              "
						+ estatistica[Cont].Cod_Cidade + "                              "
						+ estatistica[Cont].Qtd_Acidentes + "                              "
						+ estatistica[Cont].Tipo_Veiculo + "\n");
			}
		}
		JOptionPane.showMessageDialog(null, Acidentes);
	}

	void PQTDACIDENTES(Estatistica[] estatistica) {
		int Cont = 0;
		String Acidentes = "Cidades com qtd de acidentes entre 100 e 500:\nNome Cidade: / Cód Cidade: / Qtd Acidentes: / Tipo Veículo:\n";

		for (Cont = 0; Cont < 15; Cont++) {
			if ((estatistica[Cont].Qtd_Acidentes > 100) && (estatistica[Cont].Qtd_Acidentes < 500)) {
				Acidentes += (estatistica[Cont].Nome_Cidade + "                              "
						+ estatistica[Cont].Cod_Cidade + "                              "
						+ estatistica[Cont].Qtd_Acidentes + "                              "
						+ estatistica[Cont].Tipo_Veiculo + "\n");
			}
		}
		JOptionPane.showMessageDialog(null, Acidentes);
	}

	void PCONSULTAACIDENTES(Estatistica[] estatistica) {
		int Cont = 0;
		String Acidentes = "Todos os registros de cidades com acidentes:\nNome Cidade: / Cód Cidade: / Qtd Acidentes: / Tipo Veículo:\n";

		for (Cont = 0; Cont < 15; Cont++) {
			Acidentes += (estatistica[Cont].Nome_Cidade + "                              "
					+ estatistica[Cont].Cod_Cidade + "                              " + estatistica[Cont].Qtd_Acidentes
					+ "                              " + estatistica[Cont].Tipo_Veiculo + "\n");
		}
		JOptionPane.showMessageDialog(null, Acidentes);
	}

	void PVoltaMenu() {
		String Opc = "";
		do {
			Opc = JOptionPane.showInputDialog("Deseja retornar ao menu principal? (S/N)");
			if ((Opc == "S") || (Opc == "s")) {
				MenuEstatistica.main(null);
			} else if ((Opc == "N") || (Opc == "n")) {
				JOptionPane.showMessageDialog(null, "Fim!");
			} else {
				JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
			}
		} while ((Opc != "S") || (Opc != "s") || (Opc != "N") || (Opc != "n"));
	}
}
