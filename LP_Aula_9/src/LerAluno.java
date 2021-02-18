import java.io.*;

class LerAluno {

	public static void main(String[] args) throws IOException {
		Aluno[] aluno = new Aluno[3];
		int i;
		String fileName = "ArquivoAluno.txt";

		BufferedReader ler = new BufferedReader(new FileReader(fileName));

		for (i = 0; i < 3; i++)
			aluno[i] = new Aluno();

		for (i = 0; i < 3; i++) {
			aluno[i].pnome = ler.readLine();
			aluno[i].unome = ler.readLine();
			aluno[i].pontos = Integer.parseInt(ler.readLine());
		}

		for (i = 0; i < 3; i++) {
			System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);
		}
		ler.close();
		System.exit(0);
	} // fim do método
} // fim da classe
