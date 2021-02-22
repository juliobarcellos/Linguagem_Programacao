package vetores_Matrizes;

/*
********************************************************************************
Objetivo    : Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1|	1|	2|	3|
VT2|	4|	5|	6|
VT3|	1|	2|	3|	4|	5|	6
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class LT01_VT03 {

	public static void main(String args[]) {
		int VT1[] = new int[3];
		int VT2[] = new int[3];
		int VT3[] = new int[6];
		int Cont = 0;
		String Vet3 = "";

		for (Cont = 0; Cont <= 2; Cont++) {
			VT1[Cont] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um número para a posição " + (Cont + 1) + " do primeiro vetor: "));
			VT2[Cont] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um número para a posição " + (Cont + 1) + " do segundo vetor: "));
		}
		for (Cont = 0; Cont <= 5; Cont++) {
			if (Cont < 3) {
				VT3[Cont] = VT1[Cont];
				Vet3 += (VT3[Cont] + ", ");
			} else {
				VT3[Cont] = VT2[Cont - 3];
				Vet3 += (VT3[Cont] + ", ");
			}
		}
		JOptionPane.showMessageDialog(null, "Vetor3:\n" + Vet3);
	}
}
