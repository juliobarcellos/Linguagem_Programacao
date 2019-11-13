package Sistema_Votacao;

import java.util.Random;


public class testerandom {
	
	public static void main (String args[]) {
	Random r = new Random();
	int V[] = new int [30];
	int Cont;
	for (Cont=0; Cont<30; Cont++) {
		V[Cont]=r.nextInt(2000-100)+100;
	}
	}
}


/*int Opc3;
do {
	Opc3=Integer.parseInt(JOptionPane.showInputDialog("Deseja retornar ao menu principal?\n1 - Sim\n2 - Não"));
	if (Opc3==1) {Principal.main(null);}
	else if (Opc3==2) {JOptionPane.showMessageDialog(null, "Fim!");}
	else {JOptionPane.showMessageDialog(null, "Digite uma opção válida!");}
}
while ((Opc3!=1)&&(Opc3!=2));*/