package Modulariza��o;

/*
********************************************************************************
Objetivo    : Receba 2 n�meros inteiros, verifique qual o maior entre eles. 
Calcule e mostre o resultado da somat�ria dos n�meros �mpares entre esses valores.lote
Programador : Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Fun35
{
	static 	int Num1=0, Num2=0, Aux=0, Cont=0, Soma=0;
	
	public static void main (String args[])
	{

		Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero: "));
		if (Num1==Num2)
			{
				JOptionPane.showMessageDialog(null, "Os n�meros s�o iguais!");
			}
		else
			{
				JOptionPane.showMessageDialog(null, "Soma dos n�meros �mpares: "+FSoma(Num1, Num2));
			}
			
	}
	
	static int FSoma (int Num1, int Num2)
	{
		if (Num1>Num2)
		{
			for (Cont= Num2+1; Cont<Num1; Cont++)
			{
				Aux = Cont%2;
				if (Aux ==1)
				{	
					Soma+=Cont;
				}
			}
			return Soma;
		}
		else
		{
			for (Cont = Num1+1; Cont<Num2;Cont++)
			{
				Aux=Cont%2;
				if (Aux==1)
				{
					Soma+=Cont;
				}
			}
			return Soma;
		}
	}
}