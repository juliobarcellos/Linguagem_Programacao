package Prova;

import java.io.*;

import javax.swing.JOptionPane;

public class Metodos {
	
	
	Livros[] FCadastraGrava (Livros[] livros) throws IOException {
		int Cont;
		BufferedWriter grava = new BufferedWriter (new FileWriter("Livros.txt"));
		
		for (Cont=0; Cont<10; Cont++){
			livros[Cont] = new Livros();
		}
		
		for (Cont=0;Cont<10;Cont++) {
			livros[Cont].CodL = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do livro"));
			grava.write(Integer.toString(livros[Cont].CodL));
			grava.newLine();
			livros[Cont].CatL = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Categoria"));
			grava.write(Integer.toString(livros[Cont].CatL));
			grava.newLine();
			livros[Cont].NomeCat = JOptionPane.showInputDialog("Digite o nome da categoria");
			grava.write(livros[Cont].NomeCat);
			grava.newLine();
			livros[Cont].QtdL = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vezes que o livro foi emprestado"));
			grava.write(Integer.toString(livros[Cont].QtdL));
			grava.newLine();
		}
		grava.close();
		
		return livros;
	}
	
	void PMostraQtd (Livros[] livros) {
		Livros[] aux = new Livros[1];
		int Cont1, Cont2;
		String Dados = "Livro(s) mais emprestado(s):\n";
		for(Cont1=0; Cont1<9; Cont1++) {
			for (Cont2=Cont1+1; Cont2<10; Cont2++) {
				if (livros[Cont1].QtdL < livros[Cont2].QtdL) {
					aux[0] = livros[Cont1];
					livros[Cont1] = livros[Cont2];
					livros[Cont2] = aux[0];
				}
			}
		}
		for (Cont1=0; Cont1<10; Cont1++) {
			if (livros[Cont1].QtdL == livros[0].QtdL) {
				Dados+= ("Codigo:"+livros[Cont1].CodL+" Qtde:"+livros[Cont1].QtdL+"\n");
			}
			else {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, Dados);
		
	}
	
	void PMostraCat (Livros[] livros) {
		Livros[] aux = new Livros[1];
		int Cont1, Cont2, Qtd=0, Aux2;
		
		for(Cont1=0; Cont1<9; Cont1++) {
			for (Cont2=Cont1+1; Cont2<10; Cont2++) {
				if (livros[Cont1].CatL > livros[Cont2].CatL) {
					aux[0] = livros[Cont1];
					livros[Cont1] = livros[Cont2];
					livros[Cont2] = aux[0];
				}
			}
		}
		
		Aux2=livros[0].CatL;
		for(Cont1=0; Cont1<10; Cont1++) {
			Qtd=0;
			if (livros[Cont1].CatL > Aux2) {
				while (Aux2<livros[Cont1].CatL) {
					Aux2++;
				}
			}
			if (livros[Cont1].CatL == Aux2) {
				for (Cont2=Cont1; Cont2<11; Cont2++) {
					if (Cont2>9) {
						System.out.println("Qtde de livros na categoria "+livros[Cont1].CatL+" = "+Qtd);
						Aux2++;
						break;
					}
					if (livros[Cont2].CatL == livros[Cont1].CatL) {
						Qtd++;
					}
					else {
						System.out.println("Qtde de livros na categoria "+livros[Cont1].CatL+" = "+Qtd);
						Aux2++;
						break;
					}
				}
			}
		}
	}
}
