package modularizacao;

/*
********************************************************************************
Objetivo    : Receba 2 números inteiros, verifique qual o maior entre eles. 
Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class Lt01_Fun35 {
	static int Num1 = 0, Num2 = 0, Aux = 0, Cont = 0, Soma = 0;

	public static void main(String args[]) {

		Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número: "));
		if (Num1 == Num2) {
			JOptionPane.showMessageDialog(null, "Os números são iguais!");
		} else {
			JOptionPane.showMessageDialog(null, "Soma dos números ímpares: " + FSoma(Num1, Num2));
		}

	}

	static int FSoma(int Num1, int Num2) {
		if (Num1 > Num2) {
			for (Cont = Num2 + 1; Cont < Num1; Cont++) {
				Aux = Cont % 2;
				if (Aux == 1) {
					Soma += Cont;
				}
			}
			return Soma;
		} else {
			for (Cont = Num1 + 1; Cont < Num2; Cont++) {
				Aux = Cont % 2;
				if (Aux == 1) {
					Soma += Cont;
				}
			}
			return Soma;
		}
	}
}