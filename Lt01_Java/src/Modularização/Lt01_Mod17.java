package Modularização;

/*
********************************************************************************
Objetivo    : Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média 
Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/
import java.util.Scanner;
public class Lt01_Mod17
{
    private static Scanner input;
    static float TempoP=0, VelM=0, QtdL=0;;
    
	public static void main(String args [])
    {
        
        input = new Scanner(System.in);
        System.out.print("Digite o tempo de percurso (Min): ");
        TempoP = input.nextFloat();
        System.out.print("Digite a velocidade média (em Km/H): ");
        VelM = input.nextFloat();
        CalculaLitros();
        System.out.printf("Quantidade de litros gastos na viagem: %.0f", QtdL);
        
    }
	
	static void CalculaLitros ( )
	{
		QtdL = ((VelM*(TempoP/60))/12);    
	}
}