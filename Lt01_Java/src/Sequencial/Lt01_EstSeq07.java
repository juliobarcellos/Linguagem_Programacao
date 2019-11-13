package Sequencial;

/*
********************************************************************************
Objetivo    :Receba os valores do Comprimento, Largura e Altura de um paralelepípedo. Calcule e mostre seu volume. 
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstSeq07
{
    public static void main(String args [])
    {
        int C, L, A, V;
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o Comprimento de um paralelepípedo"));
        L = Integer.parseInt(JOptionPane.showInputDialog("Digite a Largura de um paralelepípedo"));
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura de um paralelepípedo"));
        V = (C*L*A);
        JOptionPane.showMessageDialog(null, "Volume do paralelepípedo: "+V);
    }
}