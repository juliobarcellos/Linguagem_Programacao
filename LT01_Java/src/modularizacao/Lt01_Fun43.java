package modularizacao;

/*
********************************************************************************
Objetivo    : Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria 
sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.    
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class Lt01_Fun43 {
	public static void main(String args[]) {
		JOptionPane.showMessageDialog(null, "Em " + FAnos() + " anos, Ana será maior que Maria");
	}

	static double FAnos() {
		double Anos = 0, Ana = 1.1, Maria = 1.5;
		while (Ana <= Maria) {
			Ana += 0.03;
			Maria += 0.02;
			Anos++;
		}
		return Anos;
	}
}
