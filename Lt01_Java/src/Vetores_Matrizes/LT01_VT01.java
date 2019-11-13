package Vetores_Matrizes;

/*
********************************************************************************
Objetivo    : Criar e coletar um vetor [50] inteiro. Calcular e exibir:
a.	A m�dia dos valores entre 10 e 200;
b.	A soma dos n�meros �mpares.

Programador : Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class LT01_VT01 {

	public static void main (String args[]){
		int VT[]= new int [5];
		int Cont=0, Soma=0, Qtd=0;
		double Media=0;
		
		for (Cont=0; Cont<=4;Cont++){
			VT[Cont]= Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
			if (VT[Cont]>=10 && VT[Cont]<=200) {
				Media+=VT[Cont];
				Qtd++;
			}
			if (VT[Cont]%2==1) {
				Soma+=VT[Cont];
			}
		}
		Media=(Media/Qtd);
		JOptionPane.showMessageDialog(null, "M�dia dos n�meros entre 10 e 200 = "+Media+"\nSoma dos n�meros �mpares = "+Soma);
	}
}
