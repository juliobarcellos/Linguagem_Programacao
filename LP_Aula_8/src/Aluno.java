class Aluno {
	String pnome;
	String unome;
	int pontos;

	// construtor
	public Aluno() {
		this("", "", 0);
	}

	public Aluno(String pnomealuno, String unomealuno, int pontosaluno) {
		pnome = pnomealuno;
		unome = unomealuno;
		pontos = pontosaluno;
	}
}
