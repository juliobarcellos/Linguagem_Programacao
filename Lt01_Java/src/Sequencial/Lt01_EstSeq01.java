package Sequencial;

/*
********************************************************************************
Objetivo    :Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado. 
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstSeq01
{
    public static void main(String args [])
    {
        int A, N;
        N = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DO LADO DE UM QUADRADO"));
        A = (N*N);
        JOptionPane.showMessageDialog(null, "A �?REA DO QUADRADO É "+A);
    }
}