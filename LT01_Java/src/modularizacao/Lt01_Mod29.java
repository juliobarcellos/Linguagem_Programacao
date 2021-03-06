package modularizacao;

/*
********************************************************************************
Objetivo    : Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança rende 3% e a renda fixa rende 5%. 
Demais tipos não serão considerados.
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class Lt01_Mod29 {
	static int Opc = 0;
	static double ValorI = 0, ValorN = 0;

	public static void main(String args[]) {
		CalculaRendimento();
		JOptionPane.showMessageDialog(null, "Valor corrigido após 30 dias: " + ValorN);
	}

	static void CalculaRendimento() {
		do {
			Opc = Integer.parseInt(JOptionPane
					.showInputDialog("Digite o tipo de investimento: \n " + "1 - Poupança \n" + " 2- Renda Fixa"));
		} while (Opc < 1 || Opc > 2);
		ValorI = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));

		if (Opc == 1) {
			ValorN = ValorI * 1.03;
		} else {
			ValorN = ValorI * 1.05;
		}
	}
}