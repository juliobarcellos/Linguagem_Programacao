package Sequencial;

/*
********************************************************************************
Objetivo    :Receba um n�mero inteiro. Calcule e mostre o seu fatorial.

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;

public class Lt01_EstRep32 {
	public static void main(String args [])
    {
		int Num=0, Fat=0, Cont=0;
        Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro para saber seu fatorial: "));
        Fat=1;
        for (Cont=Num; Cont>1; Cont--)
       	{
        	Fat = (Cont*Fat);
        }
        JOptionPane.showMessageDialog(null,"Fatorial do n�mero: "+Fat);
    }
}