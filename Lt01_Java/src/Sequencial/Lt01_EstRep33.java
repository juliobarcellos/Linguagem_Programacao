package Sequencial;

/*
********************************************************************************
Objetivo    :Receba um n�mero. Calcule e mostre a s�rie 1 + 1/2 + 1/3 + ... + 1/N.

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstRep33 {
	public static void main(String args [])
    {
		double Soma=0, Num=0, Cont=0;
        Num = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero inteiro: ")); 
        Soma=1;
        for (Cont=2; Cont<Num; Cont++)
        {
        	Soma= (double) (Soma+(1/Cont));
        }
        JOptionPane.showMessageDialog(null,"Soma da s�rie: "+Soma);
    }
}