package sequencial;

/*
********************************************************************************
Objetivo    : Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%. 
Programador : Julio Barcellos
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstSeq02 {
	public static void main(String args[]) {
		double Ns, S;
		S = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário"));
		Ns = (S * 1.15);
		JOptionPane.showMessageDialog(null, "Salário com reajuste: " + Ns);
	}
}