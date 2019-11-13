package Modularização;

/*
********************************************************************************
Objetivo    : Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N! 
Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Fun36
{
	static int Num=0, Cont=0, Cont2=0, Fat=0, Aux1=0;
    static double Div=0, Soma=0;
	public static void main (String args[])
	{
		Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
	    if (Num<1)
	       {
	    	   JOptionPane.showMessageDialog(null, "O número deve ser positivo!");
	       }
	    else
	       {
	    		JOptionPane.showMessageDialog(null, "Soma da série: "+FSerie(Num));
	       }
	}
	
	static double FSerie (int Num)
	{
		Soma=1; Fat=1;
		for (Cont=1; Cont<=Num; Cont++)
 	   {
 		   Fat=1;
 		   for (Cont2=Cont; Cont2>1;Cont2--)
 		   {
 			   Aux1= (Fat*Cont2);
 			   Fat= Aux1;
 		   }
 		   Div= (Double) (1.0/Fat);
 		   Soma+=(Double)Div;
 	   }
		return Soma;
	}
}

