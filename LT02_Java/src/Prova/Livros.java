package Prova;

 class Livros {
	 int CodL;
	 int CatL;
	 String NomeCat;
	 int QtdL;
	 
	 Livros (){
		 this(0,0,"",0);
	 }
	 
	 Livros (int cod, int cat, String Nome, int qtd){
		 CodL=cod;
		 CatL=cat;
		 NomeCat=Nome;
		 QtdL=qtd;
	 }
	 
}
