package Sequencial;

/*
********************************************************************************
Objetivo    :Receba 2 n�meros inteiros, verifique qual o maior entre eles. 
Calcule e mostre o resultado da somat�ria dos n�meros �mpares entre esses valores. 

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.*;

public class Lt01_EstRep35 {
	public static void main(String args [])
    {
		int Num1=0, Num2=0, Aux=0, Cont=0, Soma=0;
		Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero: "));
		if (Num1==Num2)
		{
			JOptionPane.showMessageDialog(null, "Os n�meros s�o iguais!");
		}
		else if (Num1>Num2)
		{
			for (Cont= Num2+1; Cont<Num1; Cont++)
			{
				Aux = Cont%2;
				if (Aux ==1)
				{	
					Soma+=Cont;
				}
			}
			JOptionPane.showMessageDialog(null, "Soma dos n�meros �mpares: "+Soma);
		}
		else
		{
			for (Cont = Num1+1; Cont<Num2;Cont++)
			{
				Aux=Cont%2;
				if (Aux==1)
				{
					Soma+=Cont;
				}
			}
			JOptionPane.showMessageDialog(null, "Soma dos n�meros �mpares: "+Soma);
		}
    }	
}