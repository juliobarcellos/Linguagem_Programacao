package Modulariza��o;

/*
********************************************************************************
Objetivo    : Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Programador : Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Mod22
{
    static  int N1=0, N2=0;
    
	public static void main(String args [])
    {
		N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero inteiro diferente do primeiro"));
        MostraOrdemCrescente();
    }
	
	static void MostraOrdemCrescente ( )
	{
		if (N1==N2)
        	{
        		JOptionPane.showMessageDialog(null,"Os dois n�meros s�o iguais!");
        	}
        else if (N1<N2)
        	{
        		JOptionPane.showMessageDialog(null, "N�meros em ordem crescente: \n"+N1+"\n"+N2);
        	}
        else
        	{
        		JOptionPane.showMessageDialog(null, "N�meros em ordem crescente: \n"+N2+"\n"+N1);
        	}
	}
}