package sequencial;

/*
********************************************************************************
Objetivo    : Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possui 2 raízes). 
Programador : Julio Barcellos
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstSeq05 {
	public static void main(String args[]) {
		double A, B, C, D, X1, X2;
		A = Double.parseDouble(JOptionPane.showInputDialog("Digite um coeficiente A de uma equação"));
		B = Double.parseDouble(JOptionPane.showInputDialog("Digite um coeficiente B de uma equação"));
		C = Double.parseDouble(JOptionPane.showInputDialog("Digite um coeficiente C de uma equação"));
		D = ((B * B) - 4 * A * C);
		X1 = (-B + Math.sqrt(D)) / 2 * A;
		X2 = (-B - Math.sqrt(D)) / 2 * A;
		JOptionPane.showMessageDialog(null, "Raízes reais da equação: \n" + "X1: " + X1 + "\nX2: " + X2);
	}
}