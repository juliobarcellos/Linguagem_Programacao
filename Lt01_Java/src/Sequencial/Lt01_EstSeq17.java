package Sequencial;

/*
********************************************************************************
Objetivo    :Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média. 
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import java.util.Scanner;
public class Lt01_EstSeq17
{
    private static Scanner input;

	public static void main(String args [])
    {
        float TempoP, VelM, QtdL;
        input = new Scanner(System.in);
        System.out.print("Digite o tempo de percurso (H,m): ");
        TempoP = input.nextFloat();
        System.out.print("Digite a velocidade m�dia (em Km/H): ");
        VelM = input.nextFloat();
        QtdL = ((VelM*TempoP)/12);
        System.out.printf("Quantidade de litros gastos na viagem: %.2f", QtdL);
    }
}