package sequencial;

/*
********************************************************************************
Objetivo    : Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos. 
Programador : Julio Barcellos
********************************************************************************
*/
import java.util.Scanner;

public class Lt01_EstSeq12 {
	private static Scanner input;

	public static void main(String args[]) {
		int AnoN, AnoA, Idade, IdadeF;
		input = new Scanner(System.in);
		System.out.print("Digite o ano de nascimento com quatro dígitos: ");
		AnoN = input.nextInt();
		System.out.print("Digite o ano atual com quatro dígitos: ");
		AnoA = input.nextInt();
		Idade = (AnoA - AnoN);
		IdadeF = (Idade + 17);
		System.out.printf("Idade atual: %d", Idade);
		System.out.printf("\nIdade em 17 anos: %d", IdadeF);
	}
}