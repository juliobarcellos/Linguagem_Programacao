package Sistema_Votacao;

import java.io.*;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) throws IOException{
	int Opc;
	Votacao2019[] votacao2019 = new Votacao2019[100];
	Metodos mtd = new Metodos ();
	
	do {
		Opc=Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE VOTA��O\n1 � Carregar Se��o/N�mero Eleitor\n2 � Classificar por Se��o\n3 � Gravar Registros\n4 � Mostrar Indicadores\n9 � Finalizar"));
		switch (Opc) {
		case 1:
			mtd.FCadastraVotacao(votacao2019);
			break;
		case 2:
			mtd.FClassificaSecao(votacao2019);
			JOptionPane.showMessageDialog(null, "Dados Classificados!");
			break;
		case 3:
			mtd.FGravaVotacao(votacao2019);
			JOptionPane.showMessageDialog(null, "Arquivo Gerado!");
			break;
		case 4:
			mtd.MostrarIndicadores();
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Fim!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Digite uma op��o v�lida!");
		}
	}
	while (Opc!=9);
	}

}
