package sequencial;

/*
********************************************************************************
Objetivo    : Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor. 
Programador :Julio Barcellos
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstDec26 {
	public static void main(String args[]) {
		int N1 = 0, N2 = 0;
		N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número"));
		if (N1 > N2) {
			if (N1 % N2 == 0) {
				JOptionPane.showMessageDialog(null, N1 + " é múltiplo de " + N2);
			} else
				JOptionPane.showMessageDialog(null, N1 + " não é múltiplo de " + N2);
		} else if (N2 > N1) {
			if (N2 % N1 == 0) {
				JOptionPane.showMessageDialog(null, N2 + " é múltiplo de " + N1);
			} else
				JOptionPane.showMessageDialog(null, N2 + " não é múltiplo de " + N1);
		} else
			JOptionPane.showMessageDialog(null, "Os números são iguais!");
	}
}