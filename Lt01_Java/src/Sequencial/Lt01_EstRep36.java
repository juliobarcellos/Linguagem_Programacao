package Sequencial;

/*
********************************************************************************
Objetivo    :Receba um n�mero N. Calcule e mostre a s�rie 1 + 1/1! + 1/2! + ... + 1/N! 

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.*;

public class Lt01_EstRep36 {
	public static void main(String args [])
    {
       int Num=0, Cont=0, Cont2=0, Fat=0, Aux1=0;
       double Div=0, Soma=0;
       Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
       Soma=1; Fat=1;
       if (Num<1)
       {
    	   JOptionPane.showMessageDialog(null, "O n�mero deve ser positivo!");
       }
       else
       {
    	   for (Cont=1; Cont<=Num; Cont++)
    	   {
    		   Fat=1;
    		   for (Cont2=Cont; Cont2>1;Cont2--)
    		   {
    			   Aux1= (Fat*Cont2);
    			   Fat= Aux1;
    		   }
    		   Div= (Double) (1.0/Fat);
    		   Soma+=(Double)Div;
    	   }
    	   JOptionPane.showMessageDialog(null, "Soma da s�rie: "+Soma);
       }
    }
}