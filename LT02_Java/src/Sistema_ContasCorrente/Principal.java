package Sistema_ContasCorrente;

import javax.swing.*;
import java.io.*;

class Principal {

	
	public static void main(String[] args) throws IOException{
		ContasCorrente[] Contas = new ContasCorrente[5];
		ContasCorrente[] Atualizado = new ContasCorrente[5];
		MovimentoContas[] Movimentos = new MovimentoContas[10];
		Metodos mtd = new Metodos();
		
		int Opc;
		do {
			Opc=Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n1 - Cadastra Contas Correntes\n2 - Cadastra Movimentos\n3 - Gera Contas Atualizadas\n4 - Consulta Cadastros\n9 - Fim"));
			switch (Opc) {
			case 1:
				mtd.FCadastraContas(Contas) ;
				mtd.FClassContas(Contas);
				mtd.GravaContas(Contas);
				break;
			case 2:
				mtd.FCadastraMovimentos(Movimentos);
				mtd.FClassMov(Movimentos);
				mtd.GravaMovimentos(Movimentos);
				break;
			case 3:
				mtd.FAtualizaContas(Contas, Movimentos, Atualizado);
				mtd.GravaAtualizacao(Atualizado);
				break;
			case 4:
				mtd.ConsultaCadastros();
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma Opção Válida!");
			}
		}
		while (Opc!=9);
	}

}
