package sequencial;

/*
********************************************************************************
Objetivo    : Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo. 
Programador : Julio Barcellos
********************************************************************************
*/
import java.util.Scanner;

public class Lt01_EstSeq14 {
	private static Scanner input;

	public static void main(String args[]) {
		int A1, A2, A3;
		input = new Scanner(System.in);
		System.out.print("Digite um ângulo de um triângulo: ");
		A1 = input.nextInt();
		System.out.print("Digite um segundo ângulo de um triângulo: ");
		A2 = input.nextInt();
		A3 = (180 - A1 - A2);
		System.out.printf("Valor do terceiro ângulo: %d", A3);
	}
}