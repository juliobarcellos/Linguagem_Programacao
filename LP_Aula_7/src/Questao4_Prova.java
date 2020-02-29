/*
********************************************************************************
Objetivo    :Receba um valor positivo inteiro maior que 0, caso contrário emitir mensagem de erro 
e coletar novo valor até que a condição seja válida. 
Faça a chamada de função recursiva que receba o valor e retorne a soma da série= 1/(N)+3/(N-1)+5/(N-2)...+X/(1)

Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
 */
import javax.swing.*;
public class Questao4_Prova {

	public static void main (String args[])
	{
		int Num=0;
		do {
			Num= Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro maior que 0: "));
			if(Num<1) {
				JOptionPane.showMessageDialog(null, "Número inválido!");
			}
		}
		while(Num<1);
		JOptionPane.showMessageDialog(null, "Soma da série: "+FSerie (1, Num));
	}
	
	static double FSerie (int Cont, int Num)
	{
				if (Num==1)
				{
					return 1;
				}
				return Num/Cont;
	}
}

