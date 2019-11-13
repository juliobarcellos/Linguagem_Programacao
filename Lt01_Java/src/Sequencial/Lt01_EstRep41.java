package Sequencial;

/*
********************************************************************************
Objetivo    :Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7. 
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

public class Lt01_EstRep41 {
	public static void main(String args [])
    {
       int Dado1=1, Dado2=1;
       System.out.println("Possibilidades de 2 dados darem a soma igual a 7: ");
       while (Dado1<=6)
    		   {
    	   while (Dado2 <=6)
    			   {
    		   if (Dado1+Dado2==7)
    		   {
    			   System.out.println(Dado1+"+"+Dado2+"=7");
    			   Dado2++;
    		   }
    		   else
    		   {
    			   Dado2++;
    		   }
    			   }
    	   Dado1++;
    	   Dado2=1;
    		   }
    }
}