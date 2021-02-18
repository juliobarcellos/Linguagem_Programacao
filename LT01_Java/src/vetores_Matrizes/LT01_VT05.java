package vetores_Matrizes;

/*
********************************************************************************
Objetivo    : Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
			  10
			  ∑ (A[1] – A[21–1])
			  i = 1
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class LT01_VT05 {

	public static void main(String args[]) {
		int VT[] = new int[10], Cont = 0, Aux = 0, Soma = 0;

		for (Cont = 0; Cont <= 9; Cont++) {
			VT[Cont] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		}
		Aux = 10;
		for (Cont = 0; Cont <= 4; Cont++) {
			Aux--;
			Soma += (VT[Cont] - VT[Aux]);
		}
		JOptionPane.showMessageDialog(null, "Soma: " + Soma);
	}
}
