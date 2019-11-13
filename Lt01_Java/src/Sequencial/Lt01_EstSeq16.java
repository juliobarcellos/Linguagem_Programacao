package Sequencial;

/*
********************************************************************************
Objetivo    :Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o n�mero de descendentes.
Calcule o sal�rio que ser�o as horas trabalhadas x o valor por hora.
Calcule o sal�rio l�quido (= Sal�rio Bruto - desconto). A cada dependente ser� acrescido R$ 100 no Sal�rio L�quido. Exiba o sal�rio a receber. 
Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
*/
import java.util.Scanner;
public class Lt01_EstSeq16
{
    private static Scanner input;

	public static void main(String args [])
    {
        float HorasT, ValorH, Desc, NumD, Sal, SLiq,SRec;
        input = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        HorasT = input.nextFloat();
        System.out.print("Digite o valor por hora: ");
        ValorH = input.nextFloat();
        System.out.print("Digite o percentual de desconto (Sem o s�mbolo): ");
        Desc = (input.nextFloat()/100);
        System.out.print("Digite o n�mero de descendentes: ");
        NumD = input.nextFloat();
        Sal = (float) (HorasT*ValorH);
        SLiq = (float) (Sal*Desc);
        SRec = (float) (SLiq+(NumD*100));
        System.out.printf("Valor do sal�rio à receber: %.2f", SRec);
    }
}