/*
Programador : Julio Barcellos
Data: 07/03/2019
Objetivo: 
*/

public class Lt01_Mat11 {
	public static void main ( String args[ ] ) {
		int M2[][]= new int [8][8];
		int X=0, Y=0, Z=0;
		
		for (Z=1;Z<=4;Z++)
		{
			for (X=(Z-1);X<=(8-Z);X++)
			{
				for (Y=(Z-1);Y<=(8-Z);Y++)
					{
						M2[X][Y]=Z;
					}
			}
		}
	}
}
