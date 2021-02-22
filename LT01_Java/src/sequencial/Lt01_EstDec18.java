package sequencial;

/*
********************************************************************************
Objetivo    : Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor. 
Programador : Julio Barcellos
********************************************************************************
*/
import java.util.Scanner;

public class Lt01_EstDec18 {
	private static Scanner input;

	public static void main(String args[]) {
		int N1, N2, Dif;
		input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		N1 = input.nextInt();
		System.out.print("Digite um segundo número inteiro: ");
		N2 = input.nextInt();
		if (N1 >= N2) {
			Dif = (N1 - N2);
		} else {
			Dif = (N2 - N1);
		}
		System.out.printf("Diferença do maior para o menor número: %d", Dif);
	}
}