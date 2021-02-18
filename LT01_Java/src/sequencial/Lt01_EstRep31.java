package sequencial;

/*
********************************************************************************
Objetivo    : Calcule e mostre o quadrado dos números entre 10 e 150.
Programador : Julio Barcellos
********************************************************************************
*/

public class Lt01_EstRep31 {
	public static void main(String args[]) {
		int cta;
		for (cta = 10; cta <= 150; cta++) {
			System.out.println("Quadrado de " + cta + "= " + (cta * cta));
		}
	}
}