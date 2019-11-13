package Sistema_ContasCorrente;

	class ContasCorrente {
	
		int Codcontac, Tipocontac;
		String NomeCliente;
		double Saldocontac, Limitecontac;
		
	
	ContasCorrente () {
		this (0,0,"",0.0,0.0);
	}
	
	ContasCorrente (int Cod, int Tipo, String Nome, double Saldo, double Limite){
		Codcontac=Cod;
		Tipocontac=Tipo;
		NomeCliente=Nome;
		Saldocontac=Saldo;
		Limitecontac=Limite;
	}
}
