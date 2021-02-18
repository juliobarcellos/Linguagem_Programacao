/*
 Objetivo: Exemplo de estrutura de decisão simples
 Programador: Julio Barcellos
 Data: 14/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDecSimples {
	public static void main(String args[]) {
		int Idade;
		Idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		if (Idade >= 18) {
			JOptionPane.showMessageDialog(null, "Maior de Idade");
		}
	}
}
