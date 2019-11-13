/*
********************************************************************************
Objetivo    :1 - Criar uma fun��o que receba e retorne o vetor carregado somente com valores entre 1 a 400, demais dever�o ser desprezados at� completar os 300 valores, usando random.
2 - Criar um procedimento que receba um n�mero inteiro e mostre a sequencia de fibonacci no pr�prio m�todo;
3 - Criar um menu de op��es para chamada das quest�es 1 e 2, assim como as respectivas vari�veis de envio e retorno. Na op��o 2 enviar cada valor do vetor carregado somente entre 1 a 10
Programador :Julio Barcellos
Data cria��o: 07/02/2019
********************************************************************************
 */
import java.util.Random;
import javax.swing.*;

public class Prova {
	
	public static void main (String args[]) {
		int Opc=0, VT[]=new int [300],Cont=0;
		do{
			Opc= Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n1- Carrega Vetor\n2- Mostra Fib\n9- Fim"));
			switch (Opc) {
			case 1:
				FCarrega(VT);
				break;
			case 2:
				for (Cont=0; Cont<300;Cont++) {
					if (VT[Cont]<11){
						ProcFib(VT[Cont]);
					}
				}
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma op��o v�lida!");
			}
		}
		while (Opc!=9);
	}
	
	public static int [] FCarrega (int VT[]) {
		int Cont=0;
		for (Cont=0; Cont<300; Cont++) {
			VT[Cont]= new Random().nextInt(400);
			if (VT[Cont]==0) {
				VT[Cont]=1;
			}
			System.out.print(VT[Cont]+",");
		}
		return VT;
	}

	static void ProcFib (int N) {
		String Fib="";
		int X=0,Y=1,Aux=0,Cont=2;
		if (N==1){
			Fib+="0";
		}
		else if (N==2) {
			Fib+="0,1";
		}
		else {
			Fib+="0,1";	
			for (Cont=3;Cont<=N;Cont++) {
				Aux=X+Y;
				Fib+=(","+Aux);
				X=Y;
				Y=Aux;
			}
		}
		System.out.print("\nSequencia de Fibonacci at� o termo de n�mero "+N+": "+Fib);
	}
}
