package Modulariza��o;

/*
********************************************************************************
Objetivo    : Receba 2 n�meros inteiros. Verifique e mostre todos os n�meros primos existentes entre eles.   
Programador : Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Fun40
{
	static int Cont1=0, Cont2=0, Aux=0, Num1=0, Num2=0;
	public static void main (String args[])
	{
		Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
	    Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero: "));
	    if (Num1==Num2)
			{
				JOptionPane.showMessageDialog(null, "Os n�meros s�o iguais!");
			}
	    else JOptionPane.showMessageDialog(null,FuncPrimos (Num1, Num2));
	}
	
	static String FuncPrimos (int Num1, int Num2)
	{
		String Primos="";
		if (Num1>Num2)
		{
			Primos=("N�meros primos entre "+Num2+" e "+Num1+": ");
			for (Cont1=Num2+1; Cont1<Num1;Cont1++)
			{
				for (Cont2=1; Cont2<=Cont1;Cont2++)
				{
					if (Cont1%Cont2==0)
					{
						Aux++;
					}
				}
				if (Aux==2)
				{
					Primos+=(Cont1+",");
					Aux=0;
				}
				else
				{
					Aux=0;
				}
			}
		}
		else
		{
			Primos=("N�meros primos entre "+Num1+" e "+Num2+": ");
			for (Cont1=Num1+1;Cont1<Num2;Cont1++)
			{
				for (Cont2=1; Cont2<=Cont1;Cont2++)
				{
					if(Cont1%Cont2==0)
					{
						Aux++;
					}
				}
				if(Aux==2)
				{
					Primos+=(Cont1+",");
					Aux=0;
				}
				else
				{
					Aux=0;
				}
			}
		}
		return Primos;
	}
}

