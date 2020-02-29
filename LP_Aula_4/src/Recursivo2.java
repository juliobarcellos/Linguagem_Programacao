/*
********************************************************************************
Objetivo    :Receba um n�mero inteiro e calcule a serie2 = (N) + (N-1) + (N-2) + ... + (1)  usando uma fun��o recursiva

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
 */
import javax.swing.*;
public class Recursivo2 {

	public static void main (String args[])
	{
		int Num=0;
		Num= Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
		JOptionPane.showMessageDialog(null, "Soma da s�rie: "+FSerie2 (Num));
	}
	
	static int FSerie2 (int Num)
	{
		int Soma=0;
		if (Num>1)
		{
			Soma = Num + FSerie2(Num-1);	
			return Soma;
		}
		else
		{
			return Num;
		}
	}
}

