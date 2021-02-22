package sequencial;

/*
********************************************************************************
Objetivo    : Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência. 
Programador : Julio Barcellos
********************************************************************************
*/
import java.util.Scanner;

public class Lt01_EstSeq11 {
	private static Scanner input;

	public static void main(String args[]) {
		float R, C;
		input = new Scanner(System.in);
		System.out.print("Digite o raio de uma circunferência: ");
		R = input.nextFloat();
		C = (float) (2 * 3.14 * R);
		System.out.printf("Comprimento da circunferência: %.2f", C);
	}
}