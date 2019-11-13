package Sequencial;

/*
********************************************************************************
Objetivo    :Receba o tipo de investimento (1 = poupan�a e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupan�a = 3% e a renda fixa = 5%. 
Demais tipos n�o ser�o considerados.

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstDec29 {
	public static void main(String args [])
    {
        int Opc=0;
		double ValorI=0, ValorN=0;
		
		do {
			Opc = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento: \n "
					+ "1 - Poupan�a \n"
					+ " 2- Renda Fixa"));
			}
		while (Opc <1 || Opc > 2);
        ValorI = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        
        if (Opc == 1)
        {
        	ValorN = ValorI*1.03;
        }
        else
        {
        	ValorN = ValorI*1.05;
        }

        JOptionPane.showMessageDialog(null,"Valor corrigido ap�s 30 dias: "+ValorN);
        
    }
}