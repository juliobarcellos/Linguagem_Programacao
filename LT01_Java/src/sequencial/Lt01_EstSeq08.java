package sequencial;

/*
********************************************************************************
Objetivo    : Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
Programador : Julio Barcellos
********************************************************************************
*/
import java.util.Scanner;

public class Lt01_EstSeq08 {
	private static Scanner input;

	public static void main(String args[]) {
		double Dep, Rend;
		input = new Scanner(System.in);
		System.out.print("Digite o valor do depósito: ");
		Dep = input.nextDouble();
		Rend = (Dep * 1.013);
		System.out.printf("Rendimento após um mês: %.2f", Rend);
		/*
		 * "%" diz que a próx variavel receberá o formato escolhido por você, ".2" diz a
		 * quantidade de casas decimais e o f é de float pode ser também s de String ou
		 * d de inteiro
		 */
	}
}