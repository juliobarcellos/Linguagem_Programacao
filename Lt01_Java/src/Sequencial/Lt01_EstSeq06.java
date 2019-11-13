package Sequencial;

/*
********************************************************************************
Objetivo    :Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos. 
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstSeq06
{
    public static void main(String args [])
    {
        int X, Y, Aux;
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite um número X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite um número Y"));
        Aux = X; 
        X = Y;
        Y = Aux;
        JOptionPane.showMessageDialog(null, "Valores inversos: \n X: "+X+"\n Y: "+Y);
    }
}