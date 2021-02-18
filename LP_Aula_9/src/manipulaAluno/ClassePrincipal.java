package manipulaAluno;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ClassePrincipal {
	public static void main(String[] args) throws IOException {

		int Opc = 0;
		Aluno[] aluno = new Aluno[3];
		ClasseGravaLer CGL = new ClasseGravaLer();
		do {
			Opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Estatísticas de Acidentes em 2019\n1 - Grava Aluno\n2 - Mostra Aluno\n9 - Finaliza"));

			switch (Opc) {
			case 1:
				aluno = CGL.GravaAluno(aluno);
				break;
			case 2:
				CGL.LerAluno(aluno);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}
		} while (Opc != 9);
	}
}
