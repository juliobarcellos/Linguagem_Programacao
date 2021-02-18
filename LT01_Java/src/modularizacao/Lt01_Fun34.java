package modularizacao;

/*
********************************************************************************
Objetivo    : Receba um número. Calcule e mostre os resultados da tabuada desse número.
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class Lt01_Fun34 {
	static int Num = 0, Result = 0, Cont = 0;

	public static void main(String args[]) {

		Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber sua tabuada: "));
		for (Cont = 1; Cont < 11; Cont++) {
			System.out.println(Num + " x " + Cont + " = " + Tabuada(Num));
		}
	}

	static int Tabuada(int Num) {
		Result = (Cont * Num);
		return Result;
	}
}