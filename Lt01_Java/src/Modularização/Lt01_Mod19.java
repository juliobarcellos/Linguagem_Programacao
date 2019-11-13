package Modulariza��o;

/*
********************************************************************************
Objetivo    : Receba 2 valores reais. Calcule e mostre o maior deles. 
Programador : Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import java.util.Scanner;
public class Lt01_Mod19
{
    private static Scanner input;
    static  double N1, N2;
    
	public static void main(String args [])
    {
        
        input = new Scanner(System.in);
        System.out.print("Digite um n�mero real: ");
        N1 = input.nextDouble();
        System.out.print("Digite um segundo n�mero real: ");
        N2 = input.nextDouble();
        CalculaDif();
        
    }
	
	static void CalculaDif ( )
	{
		 if (N1==N2)
	        {
	        	System.out.print("Os dois n�meros s�o iguais!");
	        }
	        else if (N1>N2)
	        {
	        	System.out.print("Maior n�mero: "+N1);
	        }
	        else
	        {
	        System.out.print("Maior n�mero: "+N2);
	        }
	}
}