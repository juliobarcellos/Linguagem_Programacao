package Modularização;

/*
********************************************************************************
Objetivo    : Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

import javax.swing.*;
public class Lt01_Mod23
{
    static  int N1=0, N2=0, N3=0, N4=0;
    
	public static void main(String args [])
    {
		N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número inteiro maior que o primeiro"));
        N3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro número inteiro maior que o segundo"));
        N4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um quarto número inteiro aleatório"));
        MostraOrdemCrescente();
    }
	
	static void MostraOrdemCrescente ( )
	{
		if (N2>N1 && N3>N1 && N3>N2)
		{
			if (N4<N1)
				{
					JOptionPane.showMessageDialog(null,"Números em ordem crescente: "+N4+" , "+N1+" , "+N2+" , "+N3);
				}
			else if (N4<N2)
				{
					JOptionPane.showMessageDialog(null,"Números em ordem crescente: "+N1+" , "+N4+" , "+N2+" , "+N3);
				}
			else if (N4<N3)
				{
					JOptionPane.showMessageDialog(null,"Números em ordem crescente: "+N1+" , "+N2+" , "+N4+" , "+N3);
				}
			else
				{
					JOptionPane.showMessageDialog(null,"Números em ordem crescente: "+N1+" , "+N2+" , "+N3+" , "+N4);
				}
		}
		else
			{
				JOptionPane.showMessageDialog(null, "Números não estão em ordem crescente");
			}
	}
}