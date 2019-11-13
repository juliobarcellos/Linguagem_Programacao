
/*
Programador : Julio Barcellos
Data                : 07/03/2019
Objetivo          : Calcula o Salário a Receber a partir do Salário Bruto e Desconto
                           Exemplo de Procedures

*/

import javax.swing.JOptionPane;

public class ExemploProcedure {
	static Double SalarioBruto, SalarioLiquido;

	public static void main(String args[]) {
		SalarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALÁRIO BRUTO"));
		ProcedureSalario();
		JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + SalarioLiquido);
	}

	static void ProcedureSalario() {
		Double Desconto;
		if (SalarioBruto < 500) {
			Desconto = 0.0;
		} else if (SalarioBruto >= 500 && SalarioBruto < 800) {
			Desconto = 0.05;
		} else if (SalarioBruto >= 800 && SalarioBruto < 1200) {
			Desconto = 0.10;
		} else {
			Desconto = 0.15;
		}

		SalarioLiquido = (SalarioBruto - (SalarioBruto * Desconto));
	}

}
