/*
********************************************************************************
Objetivo    :Exemplo de Do {...} While Mostra os n�meros positivos pares de 2 a 100
Programador :Julio Barcellos
Data cria��o: 21/02/2019
********************************************************************************
*/

public class Faca {
	public static void main (String args [])
	{
		int cta = 0;
		do {
			cta+=2;
			System.out.println("o numero � "+cta);
			}
		while (cta <100);
		System.exit(0);
	}
}

