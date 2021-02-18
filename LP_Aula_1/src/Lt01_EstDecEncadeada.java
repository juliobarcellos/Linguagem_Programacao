/*
 Objetivo: Exemplo de estrutura de decisão encadeada
 Programador: Julio Barcellos
 Data: 14/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDecEncadeada {
	public static void main(String args[]) {
		int Idade;
		Idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		if (Idade >= 18) {
			JOptionPane.showMessageDialog(null, "Pode votar e dirigir");
		} else if (Idade >= 16) {
			JOptionPane.showMessageDialog(null, "Pode votar, mas não dirigir");
		} else {
			JOptionPane.showMessageDialog(null, "N�o pode votar e dirigir");
		}
	}
}
