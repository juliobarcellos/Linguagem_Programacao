package Sequencial;

/*
********************************************************************************
Objetivo    :Receba um n�mero. Calcule e mostre os resultados da tabuada desse n�mero. 

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.*;

public class Lt01_EstRep34 {
	public static void main(String args [])
    {
		int Num=0, Result=0, Cont=0;
        Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para saber sua tabuada: "));
        for (Cont=1; Cont<11; Cont++)
       	{
        	Result = (Cont*Num);
        	System.out.println(Num+" x "+Cont+" = "+Result);
        }
    }
}