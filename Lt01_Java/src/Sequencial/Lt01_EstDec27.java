package Sequencial;

/*
********************************************************************************
Objetivo    :Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de dura��o (minutos).
Calcule e mostre a velocidade m�dia em km/h.
Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
import java.lang.Math;

public class Lt01_EstDec27 {
	public static void main(String args [])
    {
        float NumV=0, Ext=0, Temp=0, Aux=0;
        float VelM=0;
        NumV = Float.parseFloat(JOptionPane.showInputDialog("Digite o n�mero de voltas do circuito"));
        Ext = Float.parseFloat(JOptionPane.showInputDialog("Digite a extens�o do circuito em metros"));
        Temp = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo de dura��o em minutos"));
        Aux= (NumV*Ext);
        VelM= (Aux/(Temp*60));
        VelM= (float) VelM*3.6f;
        JOptionPane.showMessageDialog(null,"Velocidade m�dia: "+Math.round(VelM));
        
    }
}