package vetores_Matrizes;
/*
********************************************************************************
Objetivo    : Criar uma matriz [8][8] onde o programa irá carregar segundo:
 Casa  1 2 3 4 ... *Exibir a soma dos valores
 valor 1 2 4 8 ...
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class LT01_MT10 {
	public static void main(String args[]) {
		double MT[][] = new double[4][4], Soma = 0;
		int X = 0, Y = 0, Cont = 0;

		for (X = 0; X <= 3; X++) {
			for (Y = 0; Y <= 3; Y++) {
				MT[X][Y] = (int) Math.pow(2, Cont);
				Cont++;
				Soma += MT[X][Y];
			}
		}
		JOptionPane.showMessageDialog(null, "Soma dos valores: " + Soma);
	}
}