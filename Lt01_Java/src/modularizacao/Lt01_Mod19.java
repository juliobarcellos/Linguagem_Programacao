package modularizacao;

/*
********************************************************************************
Objetivo    : Receba 2 valores reais. Calcule e mostre o maior deles. 
Programador : Julio Barcellos
********************************************************************************
*/
import java.util.Scanner;

public class Lt01_Mod19 {
	private static Scanner input;
	static double N1, N2;

	public static void main(String args[]) {

		input = new Scanner(System.in);
		System.out.print("Digite um número real: ");
		N1 = input.nextDouble();
		System.out.print("Digite um segundo número real: ");
		N2 = input.nextDouble();
		CalculaDif();

	}

	static void CalculaDif() {
		if (N1 == N2) {
			System.out.print("Os dois números são iguais!");
		} else if (N1 > N2) {
			System.out.print("Maior número: " + N1);
		} else {
			System.out.print("Maior número: " + N2);
		}
	}
}