package Vetores_Matrizes;

/*
********************************************************************************
Objetivo    : 8.	Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
a.	A quantidade de cada produto vendido no mês;
b.	A quantidade de produtos vendidos por semana;
c.	O total de produtos vendidos no mês.
Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class LT01_MT08{
	public static void main (String args[]) {
		int MT[][]= new int [4][3], VT[]= new int [5],VT2[]= new int [3], X=0, Y=0;
		
		for (X=0; X<=3; X++) {
			for (Y=0; Y<=2; Y++) {
				MT[X][Y]=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas do produto "+(Y+1)+" na semana "+(X+1)+": "));
				VT[X]+=MT[X][Y];
				VT2[Y]+=MT[X][Y];
			}
		}
		VT[4]=VT2[0]+VT2[1]+VT2[2];
		JOptionPane.showMessageDialog(null, "Vendas por produto no mês:\nProduto 1: "+VT2[0]+"\nProduto 2: "+VT2[1]+"\nProduto 3: "+VT2[2]);
		JOptionPane.showMessageDialog(null, "Vendas gerais por semana:\nSemana 1: "+VT[0]+"\nSemana 2: "+VT[1]+"\nSemana 3: "+VT[2]+"\nSemana 4: "+VT[3]);
		JOptionPane.showMessageDialog(null, "Total de produtos vendidos no mês: "+VT[4]);
	}
}