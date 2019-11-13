package Modularização;

/*
********************************************************************************
Objetivo    : Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225    
Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Fun45
{
	public static void main (String args[])
	{
		JOptionPane.showMessageDialog(null,"Resultado da série: "+FSerie());
	}
	
	static double FSerie ()
	{
		double Div=0, Result=1, Cont=0, Num=1, Aux=3;
	       for (Cont=2; Cont<=15; Cont++)
	       {
	    	   Num+=Aux;
	    	   Div=Cont/Num;
	    	   if(Cont%2==0)
	    	   {
	    		   Result-=Div;
	    	   }
	    	   else
	    	   {
	    		   Result+=Div;
	    	   }
	    	   Aux+=2;
	       }
	       return Result;
	}
}

