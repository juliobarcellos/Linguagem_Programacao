package Modularização;

/*
********************************************************************************
Objetivo    : Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99    
Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Fun42
{
	public static void main (String args[])
	{
		JOptionPane.showMessageDialog(null,"Soma da série: "+FSerie ());
	}
	
	static double FSerie ()
	{
		double Cont1=2, Cont2=3, Soma=1, Div=0;
	    while (Cont1<=50 && Cont2<=99)
	       {
	    	   Div= (Double) Cont1/Cont2;
	    	   Soma+=Div;
	    	   Cont1++;
	    	   Cont2+=2;
	       }
		return Soma;
	}
}

