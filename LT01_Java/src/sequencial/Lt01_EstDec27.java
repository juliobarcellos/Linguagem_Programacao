package sequencial;

/*
********************************************************************************
Objetivo    : Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração 
(minutos).Calcule e mostre a velocidade média em km/h.
Programador :Julio Barcellos
********************************************************************************
*/
import javax.swing.JOptionPane;
import java.lang.Math;

public class Lt01_EstDec27 {
	public static void main(String args[]) {
		float NumV = 0, Ext = 0, Temp = 0, Aux = 0;
		float VelM = 0;
		NumV = Float.parseFloat(JOptionPane.showInputDialog("Digite o número de voltas do circuito"));
		Ext = Float.parseFloat(JOptionPane.showInputDialog("Digite a extensão do circuito em metros"));
		Temp = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo de duração em minutos"));
		Aux = (NumV * Ext);
		VelM = (Aux / (Temp * 60));
		VelM = (float) VelM * 3.6f;
		JOptionPane.showMessageDialog(null, "Velocidade média: " + Math.round(VelM));

	}
}