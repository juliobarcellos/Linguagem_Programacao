package Sequencial;

/*
********************************************************************************
Objetivo    :Receba o n�mero da base e do expoente. Calcule e mostre o valor da pot�ncia. 

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import javax.swing.*;

public class Lt01_EstRep44 {
	public static void main(String args [])
    {
       double Base=0, Expoente=0, Potencia=0, Cont=0;
       Base= Double.parseDouble(JOptionPane.showInputDialog("Digite a Base da pot�ncia: "));
       Expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite o expoente da pot�ncia: "));
       Potencia=Base;
       for (Cont=1; Cont<Expoente; Cont++)
       {
    	   Potencia*=Base;
       }
       System.out.print("Resultado da pot�ncia: "+Potencia);
    }
}