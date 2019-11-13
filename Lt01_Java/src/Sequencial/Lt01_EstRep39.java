package Sequencial;

/*
********************************************************************************
Objetivo    :Calcule a quantidade de gr�os contidos em um tabuleiro de xadrez onde: 
Casa:  	1 2 3 4 ... 64 
Qte: 	1 2 4 8 ... N  

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/


public class Lt01_EstRep39 {
	public static void main(String args [])
    {
      double Cont=0, Qtd=0, Soma=0;
      for (Cont=0;Cont<64;Cont++)
      {
    	  Qtd= Math.pow(2, Cont);
    	  Soma+=Qtd;
      }
      System.out.print("Quantidade de gr�os no tabuleiro: "+Soma);
    }
}