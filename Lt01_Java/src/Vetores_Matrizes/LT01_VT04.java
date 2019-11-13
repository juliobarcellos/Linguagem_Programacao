package Vetores_Matrizes;

/*
********************************************************************************
Objetivo    : Criar e coletar em um vetor [30] real e calcular e exibir:
a.	A média do grupo;
b.	A quantidade de notas acima do grupo;
c.	As posições dos valores abaixo da média do grupo.

Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class LT01_VT04 {

	public static void main (String args[]){
		double VT[]= new double [5], Media=0;
		int Cont=0, Qtd=0;
		
		for (Cont=0; Cont<=4;Cont++){
			VT[Cont]= Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
			Media+=VT[Cont];
		}
		Media=(Media/5);
		System.out.print("Media do grupo: "+Media);
		for (Cont=0; Cont<=4; Cont++) {
			if (VT[Cont]>Media) {
				Qtd++;
			}
			else {
				System.out.print("\nPosição "+Cont+" do vetor está abaixo da média");
			}
		}
		System.out.print("\nQuantidade de notas acima da média: "+Qtd);
	}
}
