/*
Programador : Julio Barcellos
Data: 07/03/2019
Objetivo: 
*/

import javax.swing.*;
public class BubblesortMT {
	public static void main ( String args[ ] ) {
		int MT[][]= new int [4][5];
		int X=0, Y=0, X2=0, Y2=0, Aux=0;
		
		for (X=0;X<4;X++){
			for (Y=0;Y<5;Y++){
				MT[X][Y]=Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição "+(X+1)+","+(Y+1)+":"));
			}
		}
		for (X=0;X<4;X++){
			for (Y=0;Y<5;Y++){
				for (X2=0;X2<4;X2++) {
					for (Y2=0; Y2<5;Y2++) {
						if ((X2==3)&&(Y2==4)) {
							break;
						}
						else if (MT[X][Y]>MT[X2][Y2]) {
							Aux=MT[X][Y];
							MT[X][Y]=MT[X2][Y2];
							MT[X][Y]=Aux;
						}
					}
				}
			}
		}
		
	}
}
