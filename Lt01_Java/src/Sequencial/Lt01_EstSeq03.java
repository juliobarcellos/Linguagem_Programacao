package Sequencial;

/*
********************************************************************************
Objetivo    :Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstSeq03
{
    public static void main(String args [])
    {
        double B, H, A;
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite a base de um triângulo"));
        H = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura de um triângulo"));
        A = ((B*H)/2);
        JOptionPane.showMessageDialog(null, "�?rea do triângulo: "+A);
    }
}