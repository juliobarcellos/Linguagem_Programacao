package modularizacao;

/*
********************************************************************************
Objetivo    : Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class Lt01_Fun33 {

	public static void main(String args[]) {
		double Num = 0;
		Num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro: "));
		JOptionPane.showMessageDialog(null, "Soma da série: " + FSerie3(Num));
	}

	static double FSerie3(double Num) {
		if (Num == 1) {
			return 1;
		} else
			return ((double) 1 / Num) + ((double) FSerie3(Num - 1));
	}
}