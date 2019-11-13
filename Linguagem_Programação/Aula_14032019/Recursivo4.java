/*
********************************************************************************
Objetivo    :Receba um n�mero inteiro e calcule a Serie4 = (N/1) +(N-1/2 ) + (N-2/3) + .... + (1/N)  usando uma fun��o recursiva

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
 */
import javax.swing.*;
public class Recursivo4 {

	public static void main (String args[])
	{
		double Num=0;
		Num= Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
		JOptionPane.showMessageDialog(null, "Soma da s�rie: "+FSerie4 (Num, 1.0));
	}
	
	static double FSerie4 (double Num, double Cont)
	{
				while (Num>1)
					{
					return ((double)Num/Cont)+((double)FSerie4(Num-1, Cont+1));
					}
				if (Num==1 && Cont ==1)
				{
					return 1;
				}
				return Num/Cont;
	}
}

