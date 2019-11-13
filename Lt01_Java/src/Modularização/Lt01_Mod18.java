package Modularização;

/*
********************************************************************************
Objetivo    : Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor. 
Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import java.util.Scanner;
public class Lt01_Mod18
{
    private static Scanner input;
    static  int N1, N2, Dif;
    
	public static void main(String args [])
    {
        
        input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        N1 = input.nextInt();
        System.out.print("Digite um segundo número inteiro: ");
        N2 = input.nextInt();
        CalculaDif();
        System.out.printf("Diferença do maior para o menor número: %d", Dif);
        
    }
	
	static void CalculaDif ( )
	{
		if (N1>=N2)
        {
        	Dif = (N1-N2);
        }
        else
        {
        	Dif = (N2-N1);
        }    
	}
}