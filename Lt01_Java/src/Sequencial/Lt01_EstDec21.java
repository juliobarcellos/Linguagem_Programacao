package Sequencial;

/*
********************************************************************************
Objetivo    :Receba 4 notas bimestrais de um aluno. Calcule e mostre a m�dia aritm�tica. 
Mostre a mensagem de acordo com a m�dia: 
a. Se a m�dia for >= 6,0 exibir �APROVADO�; 
b. Se a m�dia for >= 3,0 ou < 6,0 exibir �EXAME�; 
c. Se a m�dia for < 3,0 exibir �RETIDO�. 
Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.JOptionPane;
public class Lt01_EstDec21
{
    public static void main(String args [])
    {
        float N1, N2, N3, N4, Med;
        N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota de um aluno"));
        N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota de um aluno"));
        N3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota de um aluno"));
        N4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quarta nota de um aluno"));
        Med = ((N1+N2+N3+N4)/4);
        if (Med >=6)
        {
        	JOptionPane.showMessageDialog(null, "M�dia do aluno "+Med+"\nSitua��o do aluno: Aprovado");
        }
        else if ((Med>=3)&&(Med<6))
        {
        	JOptionPane.showMessageDialog(null, "M�dia do aluno "+Med+"\nSitua��o do aluno: Exame");
        }
        else
        {
        	JOptionPane.showMessageDialog(null, "M�dia do aluno "+Med+"\nSitua��o do aluno: Reprovado");
        }
    }
}