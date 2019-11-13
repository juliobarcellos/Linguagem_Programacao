package Vetores_Matrizes;

/*
********************************************************************************
Objetivo    : Criar e coletar em um vetor [20] com números aleatórios. 
Classificar este vetor em ordem crescente e mostre os dados.
Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class LT01_VT06{
	public static void main (String args[]) {
		int VT[]= new int[10], Cont1=0, Cont2=0, Aux=0;
		String Vetor="";
		for (Cont1=0; Cont1<=9; Cont1++) {
			VT[Cont1]=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));		
		}
		for (Cont1=0; Cont1<=8; Cont1++) {
			for (Cont2=Cont1+1; Cont2<=9; Cont2++) {
				if (VT[Cont1]>VT[Cont2]) {
					Aux=VT[Cont2];
					VT[Cont2]=VT[Cont1];
					VT[Cont1]=Aux;
				}
			}
		}
		for (Cont1=0; Cont1<=9; Cont1++) {
			Vetor+=(VT[Cont1]+", ");
		}
		JOptionPane.showMessageDialog(null, "Vetor classificado: "+Vetor);
	}
}