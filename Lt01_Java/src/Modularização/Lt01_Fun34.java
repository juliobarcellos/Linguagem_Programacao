package Modulariza��o;

/*
********************************************************************************
Objetivo    : Receba um n�mero. Calcule e mostre os resultados da tabuada desse n�mero.
Programador : Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Fun34
{
	static 	int Num=0, Result=0, Cont=0;
	
	public static void main (String args[])
	{

        Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para saber sua tabuada: "));
        for (Cont=1; Cont<11; Cont++)
        	{
        		System.out.println(Num+" x "+Cont+" = "+Tabuada(Num));
        	}
	}
	
	static int Tabuada (int Num)
	{
        	Result = (Cont*Num);
        	return Result;
	}
}