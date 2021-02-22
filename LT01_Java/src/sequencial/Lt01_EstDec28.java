package sequencial;

/*
********************************************************************************
Objetivo    : Receba o preço atual e a média mensal de um produto. 
Calcule e mostre o novo preço sabendo que:
Venda Mensal		Preço Atual		Preço Novo
< 500				< 30			+ 10%
>= 500 e < 1000		>= 30 e < 80 	+15%
>= 1000				>= 80			- 5%
Obs.: para outras condições, o preço novo será igual ao preço atual.
Programador :Julio Barcellos
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstDec28 {
	public static void main(String args[]) {
		double precoA = 0, vendaM = 0, novoP = 0;
		precoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
		vendaM = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal do produto: "));

		if (vendaM < 500 && precoA < 30) {
			novoP = precoA * 1.1;
		} else if ((vendaM >= 500 && vendaM < 1000) && (precoA >= 30 && precoA < 80)) {
			novoP = precoA * 1.15;
		} else if ((vendaM >= 1000) && (precoA >= 80)) {
			novoP = precoA * 0.95;
		} else {
			novoP = precoA;
		}

		JOptionPane.showMessageDialog(null, "Novo Preço: " + novoP);

	}
}