package Modulariza��o;

/*
********************************************************************************
Objetivo    : Receba 2 n�meros inteiros. Verifique e mostre se o maior n�mero � m�ltiplo do menor. 
Programador : Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Mod26
{
    static  int N1=0, N2=0;
    
	public static void main(String args [])
    {
		N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero"));
        VerificaMultiplo();
    }
	
	static void VerificaMultiplo ( )
	{
		if (N1>N2)
    		{
				if (N1%N2==0)
					{
						JOptionPane.showMessageDialog(null,N1+" � m�ltiplo de "+N2);
					}
				else
						JOptionPane.showMessageDialog(null,N1+" n�o � m�ltiplo de "+N2);
    		}
		else if (N2>N1)
    		{
				if (N2%N1==0)
					{
						JOptionPane.showMessageDialog(null,N2+" � m�ltiplo de "+N1);
    		}
				else
						JOptionPane.showMessageDialog(null,N2+" n�o � m�ltiplo de "+N1);	
    		}
		else
			JOptionPane.showMessageDialog(null,"Os n�meros s�o iguais!");
	}
}