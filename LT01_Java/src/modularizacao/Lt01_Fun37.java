package modularizacao;

/*
********************************************************************************
Objetivo    : Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N'ésimo termo. 
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class Lt01_Fun37 {
	static int Aux1 = 0, Aux2 = 0, Cont = 0, Fib = 0, Num = 0;

	public static void main(String args[]) {
		Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		System.out.print(Num + " primeiro(s) termo(s) da Sequência de Fibonacci: " + FFib(Num));
	}

	static String FFib(int Num) {
		String Seq = "";
		if (Num <= 1) {
			return "0";
		} else if (Num == 2) {
			return ("0,1");
		} else {
			Seq = ("0,1");
			Aux1 = 0;
			Aux2 = 1;
			Cont = 2;
			while (Cont < Num) {
				Fib = (Aux1 + Aux2);
				Aux1 = Aux2;
				Aux2 = Fib;
				Cont++;
				Seq += ("," + Fib);
			}
			return Seq;
		}
	}
}
