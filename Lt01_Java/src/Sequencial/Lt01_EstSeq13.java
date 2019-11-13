package Sequencial;

/*
********************************************************************************
Objetivo    :Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import java.util.Scanner;
public class Lt01_EstSeq13
{
    private static Scanner input;

	public static void main(String args [])
    {
        int Qtd, Dias;
        input = new Scanner(System.in);
        System.out.print("Digite a quantidade de alimento em quilos: ");
        Qtd = input.nextInt();
        Dias = ((Qtd*1000)/50);
        System.out.printf("Quantidade de dias que o alimento irá durar: %d", Dias);
    }
}