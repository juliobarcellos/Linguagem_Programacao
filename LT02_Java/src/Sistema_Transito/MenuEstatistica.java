package Sistema_Transito;

import javax.swing.*;

public class MenuEstatistica {

	public static void main(String[] args) {
		Estatistica[] estatistica = new Estatistica[15];
		Metodos mtd = new Metodos();
		String Acidentes = "Cidades com qtd de acidentes acima da média:\nNome Cidade: / Cód Cidade: / Qtd Acidentes: / Tipo Veículo:\n";
		int Opc = 0, Cont = 0;
		do {
			Opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Estatísticas de Acidentes em 2019\n1 - Cadastro Estatística\n2 - Consulta por Tipo de Veículo\n3 - Consulta por Quantidade de Acidentes\n4 - Consulta por Todas as Cidades\n5 - Consulta Maior/Menor/Média de Acidentes\n9 - Finaliza"));

			switch (Opc) {
			case 1:
				estatistica = mtd.FCADRASTRAESTATISTICA(estatistica);
				break;
			case 2:
				mtd.PTIPO(estatistica);
				break;
			case 3:
				mtd.PQTDACIDENTES(estatistica);
				break;
			case 4:
				mtd.PCONSULTAACIDENTES(estatistica);
				break;
			case 5:
				for (Cont = 0; Cont < 15; Cont++) {
					if (estatistica[Cont].Qtd_Acidentes > mtd.Med) {
						Acidentes += (estatistica[Cont].Nome_Cidade + "                              "
								+ estatistica[Cont].Cod_Cidade + "                              "
								+ estatistica[Cont].Qtd_Acidentes + "                              "
								+ estatistica[Cont].Tipo_Veiculo + "\n");
					}
				}
				JOptionPane.showMessageDialog(null, "Menor número de acidentes: " + mtd.Min
						+ "\nMaior número de acidentes: " + mtd.Max + "\n" + Acidentes);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}
		} while (Opc != 9);
	}

}
