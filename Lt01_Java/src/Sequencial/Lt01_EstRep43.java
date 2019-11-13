package Sequencial;

/*
********************************************************************************
Objetivo    :Calcule e mostre quantos anos ser�o necess�rios para que Ana seja maior que Maria 
sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.  

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/


public class Lt01_EstRep43 {
	public static void main(String args [])
    {
       double Anos=0, Ana=1.1, Maria=1.5;
       while (Ana<=Maria)
       {
    	   Ana+=0.03;
    	   Maria+=0.02;
    	   Anos++;
       }
       System.out.print("Em "+Anos+" anos, Ana ser� maior que Maria");
    }
}