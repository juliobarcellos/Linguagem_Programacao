package Sequencial;
/*
********************************************************************************
Objetivo    :Receba um valor inteiro. Verifique e mostre se � divis�vel por 2 e 3. 
Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstDec24
{
    public static void main(String args [])
    {
        int N1;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
        if (N1%2==0 && N1%3==0)
        {
        		JOptionPane.showMessageDialog(null,"O n�mero � divis�vel por 2 e por 3");
        }
        else if (N1%3==0)
        {
        	JOptionPane.showMessageDialog(null, "O n�mero � divis�vel por 3, n�o por 2");
        }
        else if (N1%2==0)
        {
        	JOptionPane.showMessageDialog(null, "O n�mero � divis�vel por 2, n�o por 3");
        }
        else
        {
        	JOptionPane.showMessageDialog(null,"O n�mero n�o � divis�vel por 2 nem por 3");
        }
    }
}