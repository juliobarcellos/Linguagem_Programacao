package Sistema_ContasCorrente;

	class MovimentoContas {
	
		int Codcontam, Tipomovimentom, Statusm;
		double Valormovimentom;
		
	MovimentoContas(){
		this(0,0,0,0.0);
	}
	
	MovimentoContas(int Cod, int Tipo, int Status, double Valor){
		Codcontam=Cod;
		Tipomovimentom=Tipo;
		Statusm=Status;
		Valormovimentom=Valor;
	}
}
