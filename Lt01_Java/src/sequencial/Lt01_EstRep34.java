package sequencial;

/*
********************************************************************************
Objetivo    : Receba um número. Calcule e mostre os resultados da tabuada desse número. 
Programador : Julio Barcellos
********************************************************************************
*/
import javax.swing.*;

public class Lt01_EstRep34 {
	public static void main(String args[]) {
		int Num = 0, Result = 0, Cont = 0;
		Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber sua tabuada: "));
		for (Cont = 1; Cont < 11; Cont++) {
			Result = (Cont * Num);
			System.out.println(Num + " x " + Cont + " = " + Result);
		}
	}
}