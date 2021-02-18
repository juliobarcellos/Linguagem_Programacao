package modularizacao;

/*
********************************************************************************
Objetivo    : Receba um número inteiro. Calcule e mostre o seu fatorial.
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class Lt01_Fun32 {

	public static void main(String args[]) {
		int Num = 0;
		Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber seu fatorial: "));
		JOptionPane.showMessageDialog(null, "Fatorial do número " + Num + ": " + fatorial(Num));
	}

	static int fatorial(int N) {
		int Fat = 0;
		if (N == 1) {
			return N;
		} else {
			Fat = (N * fatorial(N - 1));
			return Fat;
		}
	}
}
