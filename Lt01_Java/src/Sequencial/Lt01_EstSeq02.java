package Sequencial;

/*
********************************************************************************
Objetivo    :Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%. 
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstSeq02
{
    public static void main(String args [])
    {
        double Ns, S;
        S = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O SAL�?RIO DO FUNCION�?RIO"));
        Ns = (S*1.15);
        JOptionPane.showMessageDialog(null, "SAL�?RIO COM REAJUSTE: "+Ns);
    }
}