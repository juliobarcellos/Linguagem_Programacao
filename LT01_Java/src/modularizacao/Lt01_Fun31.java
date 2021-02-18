package modularizacao;

/*
********************************************************************************
Objetivo    : Calcule e mostre o quadrado dos números entre 10 e 150.
Programador : Julio Barcellos
********************************************************************************
*/

public class Lt01_Fun31 {

	public static void main(String args[]) {
		int cta = 0;
		for (cta = 10; cta <= 150; cta++) {
			System.out.println("Quadrado de " + cta + "= " + funcaoQuadrado(cta));
		}
	}

	static int funcaoQuadrado(int cta) {
		int quadrado;
		quadrado = (cta * cta);
		return quadrado;
	}
}