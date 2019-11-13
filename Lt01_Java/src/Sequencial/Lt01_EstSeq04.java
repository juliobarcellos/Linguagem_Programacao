package Sequencial;

/*
********************************************************************************
Objetivo    :Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5. 
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstSeq04
{
    public static void main(String args [])
    {
        double C, F;
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em graus Celsius"));
        F = ((9*C+160) /5);
        JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: "+F);
    }
}