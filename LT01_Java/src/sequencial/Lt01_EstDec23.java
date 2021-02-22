package sequencial;

/*
********************************************************************************
Objetivo    : Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
Mostre os 4 números em ordem crescente. 
Programador : Julio Barcellos
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstDec23 {
	public static void main(String args[]) {
		int N1, N2, N3, N4;
		N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número inteiro maior que o primeiro"));
		N3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro número inteiro maior que o segundo"));
		N4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um quarto número inteiro aleatório"));
		if (N2 > N1 && N3 > N1 && N3 > N2) {
			if (N4 < N1) {
				JOptionPane.showMessageDialog(null,
						"Números em ordem crescente: " + N4 + " , " + N1 + " , " + N2 + " , " + N3);
			} else if (N4 < N2) {
				JOptionPane.showMessageDialog(null,
						"Números em ordem crescente: " + N1 + " , " + N4 + " , " + N2 + " , " + N3);
			} else if (N4 < N3) {
				JOptionPane.showMessageDialog(null,
						"Números em ordem crescente: " + N1 + " , " + N2 + " , " + N4 + " , " + N3);
			} else {
				JOptionPane.showMessageDialog(null,
						"Números em ordem crescente: " + N1 + " , " + N2 + " , " + N3 + " , " + N4);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Números não estão em ordem crescente");
		}
	}
}