package Modularização;

/*
********************************************************************************
Objetivo    : Calcule e mostre o quadrado dos números entre 10 e 150.
Programador : Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

public class Lt01_Fun31
{

	public static void main(String args [])
    {
		int cta=0;
		for (cta=10;cta<=150;cta++)
		{
			System.out.println("Quadrado de "+cta+"= "+FuncaoQuadrado(cta));
		}
    }
	
	static int FuncaoQuadrado (int cta)
	{
		int Quadrado;
		Quadrado= (cta*cta);
		return Quadrado;
	}
}