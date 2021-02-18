/*
Programador : Julio Barcellos
Data        : 07/03/2019
Objetivo    : Exemplo de Procedures - Calcula o Salário a Receber a partir do Salário Bruto e Desconto
*/

import javax.swing.JOptionPane;

public class ExemploProcedure {
	static Double salarioBruto, salarioLiquido;

	public static void main(String args[]) {
		salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário Bruto"));
		ProcedureSalario();
		JOptionPane.showMessageDialog(null, "\n Salário Líquido = " + salarioLiquido);
	}

	static void ProcedureSalario() {
		Double desconto;
		if (salarioBruto < 500) {
			desconto = 0.0;
		} else if (salarioBruto >= 500 && salarioBruto < 800) {
			desconto = 0.05;
		} else if (salarioBruto >= 800 && salarioBruto < 1200) {
			desconto = 0.10;
		} else {
			desconto = 0.15;
		}

		salarioLiquido = (salarioBruto - (salarioBruto * desconto));
	}

}
