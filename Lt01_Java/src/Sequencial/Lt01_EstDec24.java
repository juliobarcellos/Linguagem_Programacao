package Sequencial;
/*
********************************************************************************
Objetivo    :Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3. 
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstDec24
{
    public static void main(String args [])
    {
        int N1;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        if (N1%2==0 && N1%3==0)
        {
        		JOptionPane.showMessageDialog(null,"O número é divisível por 2 e por 3");
        }
        else if (N1%3==0)
        {
        	JOptionPane.showMessageDialog(null, "O número é divisível por 3, não por 2");
        }
        else if (N1%2==0)
        {
        	JOptionPane.showMessageDialog(null, "O número é divisível por 2, não por 3");
        }
        else
        {
        	JOptionPane.showMessageDialog(null,"O número não é divisível por 2 nem por 3");
        }
    }
}