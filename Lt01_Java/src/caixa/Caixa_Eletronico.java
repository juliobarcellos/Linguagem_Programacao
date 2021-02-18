package caixa;

/*
********************************************************************************
Objetivo    :CAIXA ELETR�NICO
1.	Criar um menu de op��es:
Menu Principal
1 � Carregar Notas
2 � Retirar Notas
3 � Estat�stica
9 � Fim
1.1.	Carregar a quantidade de notas em uma �rea da mem�ria com 6 ocorr�ncias.
1.2.	Solicitar que o cliente fa�a a retirada de valores obedecendo ao crit�rio do maior pelo menor.
1.3.	Dar a op��o para o cliente escolher o valor e a quantidade de notas. P. ex.: 1 x 20, 2 x 10
1.4.	Caso n�o tenha o valor da maior c�dula, disponibilizar a pr�xima.
1.5.	Se o valor a ser solicitado for maior que o saldo total do caixa, enviar a mensagem �EXCEDEU O LIMITE DO CAIXA�.
1.6.	Solicitar at� 100 retiradas ou at� n�o haver mais notas.
1.7.	No momento da solicita��o do valor, coletar tamb�m o c�digo do banco que o cliente tem conta, segundo:
1.8.	No final, exibir a estat�stica, separada por bancos, com:
1.8.1.	O maior e o menor valor sacado;
1.8.2.	A m�dia dos saques;
1.8.3.	Valor total dos saques;
1.8.4.	Valor das sobras dos caixas.
Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/

import java.util.Scanner;

public class Caixa_Eletronico {
	public static int[] notas = new int[] { 100, 100, 100, 100, 100, 100 }; // 100,50,20,10,5,2
	public static final int[] cedulas = { 100, 50, 20, 10, 5, 2 };
	public static String[] nomeBancos = new String[] { "Banco do Brasil", "Santander", "Itau", "Caixa" };
	public static float[][] bancos = new float[][] { { 0, 9999, 0, 0, 0 }, { 0, 9999, 0, 0, 0 }, { 0, 9999, 0, 0, 0 },
			{ 0, 9999, 0, 0, 0 } }; // maior, menor, media, total, qtd
	public static Scanner sc = new Scanner(System.in);
	public static int valorCaixa = 0;

	public static void main(String[] args) {
		valorCaixa = (2 * notas[5]) + (5 * notas[4]) + (10 * notas[3]) + (20 * notas[2]) + (50 * notas[1])
				+ (100 * notas[0]);
		Menu();
	}

	public static void VoltaMenu() {
		System.out.print("\nVoltar ao menu ? S/N ");
		String dec = "";
		do {
			dec = sc.next();
			dec = dec.toUpperCase();
			if (dec.equals("S")) {
				Menu();
			} else if (dec.equals("N")) {
				break;
			} else {
				System.out.println("\nDigite uma opção válida\n");
			}
		} while (!dec.equals("S"));
	}

	public static int RetirarPersonalizado(int valor, int codBanco) {
		int _saque = valor;
		int _valorCaixa = 0;
		int _notas[] = { 0, 0, 0, 0, 0, 0 };
		int n = 0;
		System.out.printf("\n---Notas disponíveis---\n");
		System.out.printf("\n%d x R$100,00\n%d x R$50,00\n%d x R$20,00\n%d x R$10,00\n%d x R$5,00\n%d x R$2,00\n",
				notas[0], notas[1], notas[2], notas[3], notas[4], notas[5]);
		for (int i = 0; i < _notas.length; i++) {
			if (_saque >= cedulas[i]) {
				do {
					System.out.printf("\nQuantas notas de %d: ", cedulas[i]);
					n = sc.nextInt();
					if (n > notas[i]) {
						System.out.printf("\nNão há notas suficientes, quantidade de notas no caixa %d: ", notas[i]);
					} else if (n * cedulas[i] > _saque) {
						System.out.printf("\nQuantidade de cédulas maior que o valor do saque\n");
					}
				} while ((n < 1 || n > notas[i]) || n * cedulas[i] > _saque);
				for (int j = 0; j < n; j++) {
					_notas[i]++;
					_saque -= cedulas[i];
					_valorCaixa += cedulas[i];
				}
			}
		}
		if (_saque == 1) {
			_valorCaixa = 0;
			System.out.printf("\nNão é possível sacar esse valor\n");
		} else {
			bancos[codBanco][4]++; // qtd saque
			bancos[codBanco][3] += valor; // total saques
			if (valor < bancos[codBanco][1]) {
				bancos[codBanco][1] = valor; // menor saque
			}
			if (valor > bancos[codBanco][0]) {
				bancos[codBanco][0] = valor; // maior saque
			}
			for (int i = 0; i < _notas.length; i++) {
				notas[i] -= _notas[i];
			}
			System.out.printf("\n%d x R$100,00\n%d x R$50,00\n%d x R$20,00\n%d x R$10,00\n%d x R$5,00\n%d x R$2,00\n",
					notas[0], notas[1], notas[2], notas[3], notas[4], notas[5]);
		}
		return _valorCaixa;
	}

	public static void GeraEstatistica() {
		System.out.printf("\n----------Estatística----------\n\n");
		for (int i = 0; i < nomeBancos.length; i++) {
			System.out.printf("%s \n", nomeBancos[i]);
			bancos[i][2] = bancos[i][3] / bancos[i][4];
			System.out.printf("\nMaior valor retirado: %.2f \nMenor valor retirado: %.2f \nMédia: %.2f \nTotal: %.2f",
					bancos[i][0], bancos[i][1], bancos[i][2], bancos[i][3]);
			System.out.printf("\n-----------------------------\n");
		}
		System.out.printf("\nSobras do caixa: %d", valorCaixa);
	}

	public static int RetirarPadrao(int valor, int codBanco) {
		int _saque = valor;
		int _valorCaixa = 0;
		int _notas[] = { 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < notas.length; i++) {
			while (_saque >= cedulas[i]) {
				_notas[i]++;
				_saque -= cedulas[i];
				_valorCaixa += cedulas[i];
			}
		}
		if (_saque == 1) {
			_valorCaixa = 0;
			System.out.printf("\nNão é possível sacar esse valor\n");
		} else {
			bancos[codBanco][4]++; // qtd saque
			bancos[codBanco][3] += valor; // total saques
			if (valor < bancos[codBanco][1]) {
				bancos[codBanco][1] = valor; // menor saque
			}
			if (valor > bancos[codBanco][0]) {
				bancos[codBanco][0] = valor; // maior saque
			}
			for (int i = 0; i < _notas.length; i++) {
				notas[i] -= _notas[i];
			}
			System.out.printf("\n%d x R$100,00\n%d x R$50,00\n%d x R$20,00\n%d x R$10,00\n%d x R$5,00\n%d x R$2,00\n",
					notas[0], notas[1], notas[2], notas[3], notas[4], notas[5]);
		}
		return _valorCaixa;
	}

	public static void RetirarNotas() {
		int valor = 0;
		int banco = 0;
		String dec = "";
		System.out.print("\nDigite o valor a ser retirado: ");
		valor = sc.nextInt();
		if (valor > valorCaixa) {
			System.out.println("\nExcedeu o limite do caixa!\n");
		} else {
			do {
				System.out.printf("\n1 - %s\n2 - %s\n3 - %s\n4 - %s\nDigite o código do banco: ", nomeBancos[0],
						nomeBancos[1], nomeBancos[2], nomeBancos[3]);
				banco = sc.nextInt();
			} while (banco < 1 || banco > 4);
			do {
				System.out.print("\nDeseja escolher a quantidade de notas ? S/N ");
				dec = sc.next();
				dec = dec.toUpperCase();
				if (dec.equals("S") && valor >= 20) {
					valorCaixa -= RetirarPersonalizado(valor, (banco - 1));
				} else if (dec.equals("S") && valor < 20) {
					System.out.printf(
							"\nPara poder escolher a quantidade de notas, você precisa retirar mais de 20 reais\n");
					valorCaixa -= RetirarPadrao(valor, (banco - 1));
				} else if (dec.equals("N")) {
					valorCaixa -= RetirarPadrao(valor, (banco - 1));
					break;
				} else {
					System.out.println("\nDigite uma opção válida\n");
				}
			} while (!dec.equals("S") && !dec.equals("N"));
		}
	}

	public static int CarregarNotas() {
		int valor = 0;
		int _valorCaixa = 0;
		int _notas[] = { 0, 0, 0, 0, 0, 0 };
		System.out.printf("\n%d x R$100,00\n%d x R$50,00\n%d x R$20,00\n%d x R$10,00\n%d x R$5,00\n%d x R$2,00\n",
				notas[0], notas[1], notas[2], notas[3], notas[4], notas[5]);
		System.out.printf("\nDigite o valor que será carregado: ");
		valor = sc.nextInt();
		for (int i = 0; i <= 5; i++) {
			while (valor >= cedulas[i]) {
				_notas[i]++;
				valor -= cedulas[i];
				_valorCaixa += cedulas[i];
			}
		}
		if (valor == 1) {
			_valorCaixa = 0;
			System.out.printf("\nNão é possível depositar esse valor\n");
		} else {
			for (int i = 0; i < _notas.length; i++) {
				notas[i] += _notas[i];
			}
			System.out.printf("\n%d x R$100,00\n%d x R$50,00\n%d x R$20,00\n%d x R$10,00\n%d x R$5,00\n%d x R$2,00\n",
					notas[0], notas[1], notas[2], notas[3], notas[4], notas[5]);
		}
		return _valorCaixa;
	}

	public static void Menu() {
		int op = 0;
		System.out.println("\n----------Caixa Eletrônico----------\n");
		System.out.println("\n1 - Carregar notas\n2 - Retirar notas\n3 - Estatísticas\n9 - Encerrar");
		do {
			System.out.print("\nDigite a opção desejada: ");
			op = sc.nextInt();
		} while ((op < 1 || op > 3) && op != 9);
		switch (op) {
		case 1:
			valorCaixa += CarregarNotas();
			System.out.printf("\nNovo saldo: %d \n", valorCaixa);
			VoltaMenu();
			break;
		case 2:
			RetirarNotas();
			System.out.printf("\nNovo saldo: %d \n", valorCaixa);
			VoltaMenu();
			break;
		case 3:
			GeraEstatistica();
			VoltaMenu();
			break;
		case 9:
			System.out.println("\nEncerrando...");
			break;
		default:
			System.out.println("\nDigite uma opção válida!\n");
		}
	}
}
