package Modulariza��o;

/*
********************************************************************************
Objetivo    : Receba o n�mero da base e do expoente. Calcule e mostre o valor da pot�ncia.    
Programador : Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Fun44
{
	static double Base=0, Expoente=0, Potencia=0, Cont=0;
	public static void main (String args[])
	{
		Base= Double.parseDouble(JOptionPane.showInputDialog("Digite a Base da pot�ncia: "));
	    Expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite o expoente da pot�ncia: "));
		JOptionPane.showMessageDialog(null,"Resultado da pot�ncia: "+FPot(Base, Expoente));
	}
	
	static double FPot (double Base, double Expoente)
	{
		Potencia=Base;
	       for (Cont=1; Cont<Expoente; Cont++)
	       {
	    	   Potencia*=Base;
	       }
		return Potencia;
	}
}

