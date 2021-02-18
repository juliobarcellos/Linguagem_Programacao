package modularizacao;

/*
********************************************************************************
Objetivo    : Receba a hora de início e fim de um jogo (HH,MM), calcular o tempo do jogo em horas 
e minutos, sabendo que o tempo máximo de duração é de 24 horas e pode começar num dia e terminar noutro.
Programador : Julio Barcellos
********************************************************************************
*/

import javax.swing.*;

public class Lt01_Mod25 {
	static int HoraI = 0, HoraF = 0, MinI = 0, MinF = 0, HoraT = 0, MinT = 0;

	public static void main(String args[]) {
		HoraI = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do jogo (HH)"));
		MinI = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial do jogo (MM)"));
		HoraF = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do jogo (HH)"));
		MinF = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final do jogo (MM)"));
		CalculaTempoTotal();
	}

	static void CalculaTempoTotal() {
		if (HoraI == HoraF && MinI == MinF) {
			HoraT = 24;
			MinT = 00;
		} else if ((HoraI == HoraF && MinI < MinF) || (HoraI < HoraF && MinI <= MinF)) {
			HoraT = HoraF - HoraI;
			MinT = MinF - MinI;
		} else if (HoraI < HoraF && MinI > MinF) {
			HoraT = (HoraF - HoraI) - 1;
			MinT = 60 - (MinI - MinF);
		} else if (HoraI > HoraF && MinI <= MinF) {
			HoraT = 24 - (HoraI - HoraF);
			MinT = (MinF - MinI);
		} else {
			HoraT = 24 - ((HoraI - HoraF) + 1);
			MinT = 60 - (MinI - MinF);
		}
		JOptionPane.showMessageDialog(null, "Tempo total de jogo: " + HoraT + ":" + MinT);
	}
}