package Vetores_Matrizes;
/*
Objetivo: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo
1 1 1 1 1 1 1 1
1 2 2 2 2 2 2 1
1 2 3 3 3 3 2 1
1 2 3 4 4 3 2 1
1 2 3 4 4 3 2 1
1 2 3 3 3 3 2 1
1 2 2 2 2 2 2 1
1 1 1 1 1 1 1 1
Programador : Julio Barcellos
Data: 07/03/2019 
*/

import javax.swing.JOptionPane;

public class LT01_MT11 {
	public static void main ( String args[ ] ) {
		int MT[][]= new int [8][8];
		int X=0, Y=0, Z=0;
		String Matriz="";
		
		for (Z=1;Z<=4;Z++)
		{
			for (X=(Z-1);X<=(8-Z);X++)
			{
				for (Y=(Z-1);Y<=(8-Z);Y++)
				{
					MT[X][Y]=Z;
				}
			}
		}
		for (X=0; X<=7; X++) {
			for (Y=0; Y<=7;Y++) {
				if (Y==7) {
					Matriz+=(MT[X][Y]+"\n");
				}
				else {
					Matriz+=(MT[X][Y]+" ");
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Matriz carregada:\n"+Matriz);
	}
}
