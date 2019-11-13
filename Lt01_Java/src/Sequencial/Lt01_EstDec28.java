package Sequencial;

/*
********************************************************************************
Objetivo    :Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal		Preço Atual		Preço Novo
< 500				< 30			+ 10%
>= 500 e < 1000		>= 30 e < 80 	+15%
>= 1000				>= 80			- 5%
Obs.: para outras condições, preço novo será igual ao preço atual.

Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstDec28 {
	public static void main(String args [])
    {
        double PreçoA=0, VendaM=0, NovoP=0;
        PreçoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
        VendaM = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal do produto: "));
        
        if (VendaM < 500 && PreçoA < 30)
        {
        	NovoP = PreçoA*1.1;
        }
        else if ((VendaM >=500 && VendaM <1000) && (PreçoA >= 30 && PreçoA <80))
        {
        	NovoP = PreçoA*1.15;
        }
        else if ((VendaM >=1000) && (PreçoA >= 80))
        {
        	NovoP = PreçoA*0.95;
        }
        else
        {
        	NovoP = PreçoA;
        }

        JOptionPane.showMessageDialog(null,"Novo Preço: "+NovoP);
        
    }
}