package Modulariza��o;

/*
********************************************************************************
Objetivo    : Receba um n�mero. Calcule e mostre a s�rie 1 + 1/2 + 1/3 + ... + 1/N.
Programador : Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Fun33
{
	
	public static void main (String args[])
	{
		double Num=0;
		Num= Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
		JOptionPane.showMessageDialog(null, "Soma da s�rie: "+FSerie3 (Num));
	}
	
	static double FSerie3 (double Num)
	{
			if (Num == 1)
					{
				return 1;
					}
			else
				return ((double)1/Num)+((double)FSerie3(Num-1));
	}
}