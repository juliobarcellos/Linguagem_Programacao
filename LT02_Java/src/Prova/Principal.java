package Prova;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal {

	
	public static void main (String args[]) throws IOException{
		int Opc;
		Livros[] livros = new Livros [10];
		Metodos mtd = new Metodos();
		
		do {
			Opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n1 - Cadastra e Grava\n2 - Mostra Qtd\n3 - Mostra Categorias\n9 - Fim"));
			switch (Opc){
				case 1:
					livros=mtd.FCadastraGrava(livros);
					break;
				case 2:
					mtd.PMostraQtd(livros);
					break;
				case 3:
					mtd.PMostraCat(livros);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Fim!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
			}
		}
		while (Opc!=9);
	}
}
