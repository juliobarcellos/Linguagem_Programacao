package Sequencial;

/*
********************************************************************************
Objetivo    :Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstRep33 {
	public static void main(String args [])
    {
		double Soma=0, Num=0, Cont=0;
        Num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro: ")); 
        Soma=1;
        for (Cont=2; Cont<Num; Cont++)
        {
        	Soma= (double) (Soma+(1/Cont));
        }
        JOptionPane.showMessageDialog(null,"Soma da série: "+Soma);
    }
}