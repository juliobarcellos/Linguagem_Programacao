package Vetores_Matrizes;
/*
Objetivo: Carregar c�digos das pe�as em um tabuleiro de xadrez, onde:
C�digo:	  1    2	 3		4	  5		6	 7
Pe�a: 	Pe�o Torre Bispo Cavalo Rainha Rei Vazio 
Calcular e mostrar a soma das pe�as do tabuleiro.
N�o pode utilizar estrutura de decis�o e Escolha Caso na contagem das pe�as
Programador : Julio Barcellos
Data: 07/03/2019 
*/

import javax.swing.*;
import java.util.Random;

public class LT01_MT12 {
	public static void main ( String args[ ] ) {
		int MT[][]= new int [8][8], VT[]=new int [7];
		int X=0, Y=0;
		Random gerador = new Random();
		String Vetor="";
		
			for (X=0;X<7;X++)
			{
				for (Y=0;Y<=7;Y++)
				{
					MT[X][Y]= gerador.nextInt(7);
					VT[MT[X][Y]]++;
				}
			}
			for (X=0; X<=6; X++){
				Vetor+=("Qtd pe�as do tipo "+(X+1)+" : "+VT[X]+" ");
			}
		JOptionPane.showMessageDialog(null, Vetor);
	}
}
