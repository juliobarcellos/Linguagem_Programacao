package Sequencial;

/*
********************************************************************************
Objetivo    :Receba o pre�o atual e a m�dia mensal de um produto. Calcule e mostre o novo pre�o sabendo que:
Venda Mensal		Pre�o Atual		Pre�o Novo
< 500				< 30			+ 10%
>= 500 e < 1000		>= 30 e < 80 	+15%
>= 1000				>= 80			- 5%
Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstDec28 {
	public static void main(String args [])
    {
        double Pre�oA=0, VendaM=0, NovoP=0;
        Pre�oA = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o atual do produto: "));
        VendaM = Double.parseDouble(JOptionPane.showInputDialog("Digite a m�dia mensal do produto: "));
        
        if (VendaM < 500 && Pre�oA < 30)
        {
        	NovoP = Pre�oA*1.1;
        }
        else if ((VendaM >=500 && VendaM <1000) && (Pre�oA >= 30 && Pre�oA <80))
        {
        	NovoP = Pre�oA*1.15;
        }
        else if ((VendaM >=1000) && (Pre�oA >= 80))
        {
        	NovoP = Pre�oA*0.95;
        }
        else
        {
        	NovoP = Pre�oA;
        }

        JOptionPane.showMessageDialog(null,"Novo Pre�o: "+NovoP);
        
    }
}