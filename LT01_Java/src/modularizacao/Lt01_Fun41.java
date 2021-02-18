package modularizacao;

/*
********************************************************************************
Objetivo    : Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.    
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class Lt01_Fun41 {
	public static void main(String args[]) {
		JOptionPane.showMessageDialog(null, "Possibilidades de 2 dados darem a soma igual a 7: \n" + FuncDados());
	}

	static String FuncDados() {
		String Dados = "";
		int Dado1 = 1, Dado2 = 1;
		while (Dado1 <= 6) {
			while (Dado2 <= 6) {
				if (Dado1 + Dado2 == 7) {
					Dados += (Dado1 + "+" + Dado2 + "=7\n");
					Dado2++;
				} else {
					Dado2++;
				}
			}
			Dado1++;
			Dado2 = 1;
		}
		return Dados;
	}
}
