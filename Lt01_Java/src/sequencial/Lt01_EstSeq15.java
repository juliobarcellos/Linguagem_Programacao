package sequencial;

/*
********************************************************************************
Objetivo    : Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.  
Programador : Julio Barcellos
********************************************************************************
*/
import java.util.Scanner;

public class Lt01_EstSeq15 {
	private static Scanner input;

	public static void main(String args[]) {
		float C1, C2, H;
		input = new Scanner(System.in);
		System.out.print("Digite um cateto de um triângulo retângulo: ");
		C1 = input.nextFloat();
		System.out.print("Digite o segundo cateto de um triângulo retângulo: ");
		C2 = input.nextFloat();
		H = (float) (Math.sqrt((C1 * C1) + (C2 * C2)));
		System.out.printf("Valor da hipotenusa: %.2f", H);
	}
}