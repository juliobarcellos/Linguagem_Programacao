/*
********************************************************************************
Objetivo    :Receba um valor positivo inteiro maior que 0, caso contr�rio emitir mensagem de erro 
e coletar novo valor at� que a condi��o seja v�lida. 
Fa�a a chamada de fun��o recursiva que receba o valor e retorne a soma da s�rie= 1/(N)+3/(N-1)+5/(N-2)...+X/(1)

Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
 */
import javax.swing.*;
public class Questao4_Prova {

	public static void main (String args[])
	{
		int Num=0;
		do {
			Num= Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro maior que 0: "));
			if(Num<1) {
				JOptionPane.showMessageDialog(null, "N�mero inv�lido!");
			}
		}
		while(Num<1);
		JOptionPane.showMessageDialog(null, "Soma da s�rie: "+FSerie (1, Num));
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

