package Vetores_Matrizes;
/*
********************************************************************************
Objetivo    : Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo:1,4,16,64
Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class LT01_MT09{
	public static void main (String args[]) {
		int MT[][]= new int [4][4], X=0, Y=0;
		String Matriz="";
		
		for (X=0; X<=3; X++) {
			for (Y=0; Y<=3; Y++) {
				if (X==Y) {
					MT[X][Y]=(int)Math.pow(4, X);
				}
				else {
					MT[X][Y]= (int)(Math.random()*100);
				}
				if (Y==3) {
					Matriz+=(MT[X][Y]+"\n");
				}
				else {
					Matriz+=(MT[X][Y]+" ");
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Matriz carregada:\n"+Matriz);
	}
}