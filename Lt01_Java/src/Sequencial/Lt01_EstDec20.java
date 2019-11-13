package Sequencial;

/*
********************************************************************************
Objetivo    :Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre. 
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstDec20
{
    public static void main(String args [])
    {
        double A, B, C, D, X1, X2;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite um coeficiente A de uma equação"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite um coeficiente B de uma equação"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite um coeficiente C de uma equação"));
        D = ((B*B)-4*A*C);
        if (D>=0)
        {
        X1 = (-B+ Math.sqrt(D))/2*A;
        X2 = (-B-Math.sqrt(D))/2*A;
        JOptionPane.showMessageDialog(null, "Raízes reais da equação: \n"+"X1: "+X1+"\nX2: "+X2);
        }
        else
        {
        	JOptionPane.showMessageDialog(null, "Não existem raízes reais na equação");
        }
    }
}