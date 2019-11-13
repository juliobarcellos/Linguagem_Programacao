package Sequencial;

/*
********************************************************************************
Objetivo    :Receba 3 coeficientes A, B, e C de uma equa��o do 2� grau da f�rmula AX�+BX+C=0. 
Verifique e mostre a exist�ncia de ra�zes reais e se caso exista, calcule e mostre. 
Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstDec20
{
    public static void main(String args [])
    {
        double A, B, C, D, X1, X2;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite um coeficiente A de uma equa��o"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite um coeficiente B de uma equa��o"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite um coeficiente C de uma equa��o"));
        D = ((B*B)-4*A*C);
        if (D>=0)
        {
        X1 = (-B+ Math.sqrt(D))/2*A;
        X2 = (-B-Math.sqrt(D))/2*A;
        JOptionPane.showMessageDialog(null, "Ra�zes reais da equa��o: \n"+"X1: "+X1+"\nX2: "+X2);
        }
        else
        {
        	JOptionPane.showMessageDialog(null, "N�o existem ra�zes reais na equa��o");
        }
    }
}