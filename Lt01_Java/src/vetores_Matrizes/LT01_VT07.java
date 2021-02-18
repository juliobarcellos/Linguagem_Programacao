package vetores_Matrizes;

/*
********************************************************************************
Objetivo    : A partir do exercício 6 (vetor classificado) solicitar um valor qualquer 
e verificar a sua existência no vetor (utilizar pesquisa binária).
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class LT01_VT07 {
	public static void main(String args[]) {
		int VT[] = { 5, 8, 9, 10, 11, 12, 13, 15, 25, 32 }, Num = 0, Inicio = 0, Meio = 0, Fim = 9, Aux = 1;

		Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para ser pesquisado no vetor: "));

		do {
			Meio = (Inicio + Fim) / 2;
			if (VT[Meio] == Num) {
				Aux = 0;
			} else if (Num > VT[Meio]) {
				Inicio = Meio + 1;
			} else {
				Fim = Meio - 1;
			}
		} while ((Inicio <= Fim) && (Aux == 1));

		if (Aux == 0) {
			JOptionPane.showMessageDialog(null, "Valor encontrado na posição " + (Meio + 1) + " do vetor");
		} else {
			JOptionPane.showMessageDialog(null, "Valor não encontrado no vetor");
		}
	}
}