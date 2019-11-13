package Sequencial;

/*
********************************************************************************
Objetivo    :Receba o número da base e do expoente. Calcule e mostre o valor da potência. 

Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import javax.swing.*;

public class Lt01_EstRep44 {
	public static void main(String args [])
    {
       double Base=0, Expoente=0, Potencia=0, Cont=0;
       Base= Double.parseDouble(JOptionPane.showInputDialog("Digite a Base da potência: "));
       Expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite o expoente da potência: "));
       Potencia=Base;
       for (Cont=1; Cont<Expoente; Cont++)
       {
    	   Potencia*=Base;
       }
       System.out.print("Resultado da potência: "+Potencia);
    }
}