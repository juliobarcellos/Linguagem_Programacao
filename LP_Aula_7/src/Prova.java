
/*
********************************************************************************
Objetivo    : 1- Criar uma função que receba e retorne o vetor carregado somente com valores entre 1 a 400, demais valores deverão ser desprezados até completar os 300 valores, usando random.
			  2- Criar um procedimento que receba um número inteiro e mostre a sequencia de fibonacci até o N'ésimo valor no próprio método;
			  3- Criar um menu de opções para chamada das questões 1 e 2, assim como as respectivas variáveis de envio e retorno. Na opção 2 enviar cada valor do vetor carregado somente entre 1 a 10
Programador : Julio Barcellos
Data criação: 11/04/2019
********************************************************************************
 */
import java.util.Random;
import javax.swing.*;

public class Prova {

	public static void main(String args[]) {
		int Opc = 0, vt[] = new int[300], Cont = 0;
		do {
			Opc = Integer.parseInt(
					JOptionPane.showInputDialog("Menu Principal\n1- Carrega Vetor\n2- Mostra Fibonacci\n9- Fim"));
			switch (Opc) {
			case 1:
				carregaVetor(vt);
				break;
			case 2:
				for (Cont = 0; Cont < 300; Cont++) {
					if (vt[Cont] < 11) {
						ProcFib(vt[Cont]);
					}
				}
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
			}
		} while (Opc != 9);
	}

	public static int[] carregaVetor(int vt[]) {
		int Cont = 0;
		for (Cont = 0; Cont < 300; Cont++) {
			vt[Cont] = new Random().nextInt(400);
			if (vt[Cont] == 0) {
				vt[Cont] = 1;
			}
			System.out.print(vt[Cont] + ",");
		}
		return vt;
	}

	static void ProcFib(int N) {
		String Fib = "";
		int X = 0, Y = 1, Aux = 0, Cont = 2;
		if (N == 1) {
			Fib += "0";
		} else if (N == 2) {
			Fib += "0,1";
		} else {
			Fib += "0,1";
			for (Cont = 3; Cont <= N; Cont++) {
				Aux = X + Y;
				Fib += ("," + Aux);
				X = Y;
				Y = Aux;
			}
		}
		System.out.print("\nSequencia de Fibonacci até o termo de número " + N + ": " + Fib);
	}
}
