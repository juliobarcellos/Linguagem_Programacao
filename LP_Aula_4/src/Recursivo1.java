/*
********************************************************************************
Objetivo    :Calcule a serie1 = (1+2+3+...+100) usando uma fun��o recursiva

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
 */
import javax.swing.*;
public class Recursivo1 {

	public static void main (String args[])
	{
		int Cont=0;
		JOptionPane.showMessageDialog(null, "Soma da s�rie: "+FSerie1 (Cont));
	}
	
	static int FSerie1 (int Cont)
	{
		int Soma=0;
		if (Cont<100)
		{
			Soma = Cont + FSerie1(Cont+1);	
			return Soma;
		}
		else
		{
			return Cont;
		}
	}
}

