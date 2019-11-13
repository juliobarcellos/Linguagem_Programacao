package Sequencial;

/*
********************************************************************************
Objetivo    :Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.

Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.*;

public class Lt01_EstRep37 {
	public static void main(String args [])
    {
       int Aux1=0, Aux2=0, Cont=0, Fib=0, Num=0;
       Num= Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
       System.out.print(Num+" primeiro(s) termo(s) da Sequencia de Fibonacci: ");
       if (Num<=1)
       {
    	   System.out.print(0);
       }
       else if (Num==2)
       {
    	   System.out.print("0,1");
       }
       else
       {
    	   System.out.print("0,1");
    	   Aux1=0; Aux2=1; Cont=2;
    	   while (Cont<Num)
    	   {
    		   Fib=(Aux1+Aux2);
    		   Aux1=Aux2;
    		   Aux2=Fib;
    		   Cont++;
    		   System.out.print(","+Fib);
    	   }
       }
     
    }
}