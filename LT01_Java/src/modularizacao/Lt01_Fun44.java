package modularizacao;

/*
********************************************************************************
Objetivo    : Receba o número da base e do expoente. Calcule e mostre o valor da potência.    
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class Lt01_Fun44 {
	static double Base = 0, Expoente = 0, Potencia = 0, Cont = 0;

	public static void main(String args[]) {
		Base = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base da potência: "));
		Expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite o expoente da potência: "));
		JOptionPane.showMessageDialog(null, "Resultado da potência: " + FPot(Base, Expoente));
	}

	static double FPot(double Base, double Expoente) {
		Potencia = Base;
		for (Cont = 1; Cont < Expoente; Cont++) {
			Potencia *= Base;
		}
		return Potencia;
	}
}
