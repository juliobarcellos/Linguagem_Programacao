package Sequencial;

/*
********************************************************************************
Objetivo    :Receba o sal√°rio de um funcion√°rio e mostre o novo sal√°rio com reajuste de 15%. 
Programador :Julio Barcellos
Data cria√ß√£o: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstSeq02
{
    public static void main(String args [])
    {
        double Ns, S;
        S = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O SAL√?RIO DO FUNCION√?RIO"));
        Ns = (S*1.15);
        JOptionPane.showMessageDialog(null, "SAL√?RIO COM REAJUSTE: "+Ns);
    }
}