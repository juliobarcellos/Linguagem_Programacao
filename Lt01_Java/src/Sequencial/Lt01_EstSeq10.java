package Sequencial;

/*
********************************************************************************
Objetivo    :Receba 2 números reais. Calcule e mostre a diferença desses valores.
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import java.util.Scanner;
public class Lt01_EstSeq10
{
    private static Scanner input;

	public static void main(String args [])
    {
        float N1, N2, Dif;
        input = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        N1 = input.nextFloat();
        System.out.print("Digite um segundo número real: ");
        N2 = input.nextFloat();
        Dif= (N1-N2);
        System.out.printf("Diferença entre os dois números: %.2f", Dif);
    }
}