package sequencial;

/*
********************************************************************************
Objetivo    : Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado. 
Programador : Julio Barcellos
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstSeq01 {
	public static void main(String args[]) {
		int A, N;
		N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado de um quadrado"));
		A = (N * N);
		JOptionPane.showMessageDialog(null, "A área do quadrado é = " + A);
	}
}