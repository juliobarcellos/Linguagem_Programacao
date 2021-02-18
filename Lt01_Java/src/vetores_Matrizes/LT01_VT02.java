package vetores_Matrizes;

/*
********************************************************************************
Objetivo    : Criar e coletar um vetor [100] inteiro e exibir:
			  a. O maior e o menor valor;
			  b. A média dos valores.
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class LT01_VT02 {

	public static void main(String args[]) {
		int VT[] = new int[5];
		int Cont = 0, Min = 0, Max = 0;
		double Media = 0;

		for (Cont = 0; Cont <= 4; Cont++) {
			VT[Cont] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
			if (Min == 0 && Max == 0) {
				Min = VT[Cont];
				Max = VT[Cont];
			} else if (VT[Cont] < Min) {
				Min = VT[Cont];
			} else if (VT[Cont] > Max) {
				Max = VT[Cont];
			}
			Media += VT[Cont];
		}
		Media = (Media / 5);
		JOptionPane.showMessageDialog(null,
				"Menor número = " + Min + "\nMaior número = " + Max + "\nMédia dos valores = " + Media);
	}
}
