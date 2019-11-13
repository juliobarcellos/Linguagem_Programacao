package Sequencial;

/*
********************************************************************************
Objetivo    :Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. 
Obs.: somente valores positivos. 

Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.*;

public class Lt01_EstRep38 {
	public static void main(String args [])
    {
       double Cont=0, Num=0, Max=0, Min=0;
       for (Cont=1; Cont<=10;Cont++)
       {
    	   Num= Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
    	   if (Min==0)
    	   {
    		   if (Num>0)
    		   {
    			   Min=Num;
    		   }
    	   }
    	   if (Num>0)
    	   {
    		   if (Num>Max)
    		   {
    			   Max=Num;
    		   }
    		   else if (Num<Min)
    		   {
    			   Min=Num;
    		   }
    	   }
       }
       JOptionPane.showMessageDialog(null, "Maior Número: "+Max+"\nMenor Número: "+Min);
    }
}