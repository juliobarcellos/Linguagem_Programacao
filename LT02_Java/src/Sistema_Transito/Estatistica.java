package Sistema_Transito;

class Estatistica {

	String Nome_Cidade;
	int Cod_Cidade, Qtd_Acidentes, Tipo_Veiculo;

	Estatistica() {
		this("", 0, 0, 0);
	}

	Estatistica(String Nome_CidadeF, int Cod_CidadeF, int Qtd_AcidentesF, int Tipo_VeiculoF) {
		Nome_Cidade = Nome_CidadeF;
		Cod_Cidade = Cod_CidadeF;
		Qtd_Acidentes = Qtd_AcidentesF;
		Tipo_Veiculo = Tipo_VeiculoF;
	}
}
