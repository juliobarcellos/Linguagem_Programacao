/*
********************************************************************************
Objetivo    :Coletar um N� positivo, calcule e mostre o seu fatorial a partir de uma fun��o recursiva. 

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
 */
import javax.swing.*;
public class RecursivoExemplo {

	public static void main (String args[])
	{
		int Num=0;
		Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para saber seu fatorial: "));
		JOptionPane.showMessageDialog(null, "Fatorial do n�mero "+Num+": "+FFat (Num));
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

	