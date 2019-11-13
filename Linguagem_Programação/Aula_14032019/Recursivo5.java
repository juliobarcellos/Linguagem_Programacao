/*
********************************************************************************
Objetivo    :Receba um n�mero inteiro e calcule a Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)! usando uma fun��o recursiva

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
 */
import javax.swing.*;
public class Recursivo5 {

	public static void main (String args[])
	{
		int Num=0;
		Num= Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
		JOptionPane.showMessageDialog(null, "Soma da s�rie: "+FSerie5 (Num));
	}
	
	static int FSerie5 (int Num)
	{
			if (Num == 1)
					{
				return 1;
					}
			else
				return (FFat (Num))+(FSerie5(Num-1));
	}
	
	static int FFat (int N)
	{
		int Fat=0;
		if (N==1)
		{
			return N;
		}
		else
		{
			Fat=(N*FFat(N-1));
			return Fat;
		}
	}
}

