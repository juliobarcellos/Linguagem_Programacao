package Sequencial;

/*
********************************************************************************
Objetivo    :Receba 2 valores inteiros. Calcule e mostre o resultado da diferen�a do maior pelo menos valor. 
Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import java.util.Scanner;
public class Lt01_EstDec18
{
    private static Scanner input;

	public static void main(String args [])
    {
        int N1, N2, Dif;
        input = new Scanner(System.in);
        System.out.print("Digite um n�mero inteiro: ");
        N1 = input.nextInt();
        System.out.print("Digite um segundo n�mero inteiro: ");
        N2 = input.nextInt();
        if (N1>=N2)
        {
        	Dif = (N1-N2);
        }
        else
        {
        	Dif = (N2-N1);
        }
        System.out.printf("Diferen�a do maior para o menor n�mero: %d", Dif);
    }
}