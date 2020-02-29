/*
Programador : Julio Barcellos
Data: 07/03/2019
Objetivo: 
*/

import javax.swing.*;
public class ExMat01 {
	public static void main ( String args[ ] ) {
		int M2[][]= new int [2][3];
		int X=0, Y=0, S=0;
		
		for (X=0;X<2;X++)
		{
			for (Y=0;Y<3;Y++)
			{
				M2[X][Y]=Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição "+(X+1)+","+(Y+1)+":"));
				S+=M2[X][Y];
			}
		}
		JOptionPane.showMessageDialog(null, "Soma da Matriz: "+S);
	}
}
