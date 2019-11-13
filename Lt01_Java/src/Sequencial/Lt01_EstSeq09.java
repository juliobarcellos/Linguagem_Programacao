package Sequencial;

/*
********************************************************************************
Objetivo    :Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import java.util.Scanner;
public class Lt01_EstSeq09
{
    private static Scanner input;

	public static void main(String args [])
    {
        int N1, N2, Soma;
        input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        N1 = input.nextInt();
        System.out.print("Digite um segundo número inteiro: ");
        N2 = input.nextInt();
        Soma = ((N1*N1)+(N2*N2));
        System.out.printf("Soma dos quadrados dos dois números: %d", Soma);
    }
}