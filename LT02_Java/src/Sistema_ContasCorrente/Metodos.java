package Sistema_ContasCorrente;

import java.io.*;
import java.util.Random;
import javax.swing.*;

	class Metodos {
		Random r= new Random();
		private BufferedReader ler;
		
	ContasCorrente[] FCadastraContas(ContasCorrente[] Contas) {
		int Cont;
		String Nomes[]= {"Ana","Joao","Ester","Fabio","Livia","Felipe","Erica","Saulo","Clara","Luciano"};
		for (Cont=0; Cont<5; Cont++) {
			Contas[Cont]= new ContasCorrente();
		}
		for (Cont=0; Cont<5; Cont++) {
			Contas[Cont].NomeCliente = Nomes[r.nextInt(9)];
			Contas[Cont].Codcontac= Cont+1;
			Contas[Cont].Tipocontac= r.nextInt(5-1)+1;
			if (Contas[Cont].Tipocontac==1) {
				Contas[Cont].Limitecontac=0;
			}
			else {
				Contas[Cont].Limitecontac= r.nextInt(2000-100)+100;
			}
			Contas[Cont].Saldocontac= r.nextInt(2000);
		}
		return Contas;
	}
	
	ContasCorrente[] FClassContas (ContasCorrente[]Contas) {
		int Cont1, Cont2;
		ContasCorrente Aux[] = new ContasCorrente [1];
		
		for (Cont1=0; Cont1<4; Cont1++) {
			for (Cont2=Cont1+1;Cont2<5; Cont2++) {
				if (Contas[Cont1].Codcontac > Contas[Cont2].Codcontac) {
					Aux[0]=Contas[Cont1];
					Contas[Cont1]=Contas[Cont2];
					Contas[Cont2]=Aux[0];
				}
			}
		}
		return Contas;
	}
	
	void GravaContas (ContasCorrente[] Contas) throws IOException{
		int Cont;
		String Arquivo = "Contas.txt";
		BufferedWriter Gravar = new BufferedWriter(new FileWriter(Arquivo));
		for (Cont=0; Cont<5; Cont++) {
			Gravar.write(Contas[Cont].Codcontac+"");
			Gravar.newLine();
			Gravar.write(Contas[Cont].Tipocontac+"");
			Gravar.newLine();
			Gravar.write(Contas[Cont].NomeCliente);
			Gravar.newLine();
			Gravar.write(Contas[Cont].Saldocontac+"");
			Gravar.newLine();
			Gravar.write(Contas[Cont].Limitecontac+"");
			Gravar.newLine();
		}
		Gravar.close();
	}
	
	MovimentoContas[] FCadastraMovimentos(MovimentoContas[] Movimentos) {
		int Cont;
		for (Cont=0; Cont<10; Cont++) {
			Movimentos[Cont]= new MovimentoContas();
		}
		for (Cont=0; Cont<10; Cont++) {
			Movimentos[Cont].Codcontam = r.nextInt(6-1)+1;
			Movimentos[Cont].Tipomovimentom = r.nextInt(3-1)+1;
			Movimentos[Cont].Statusm = r.nextInt(3-1)+1;
			Movimentos[Cont].Valormovimentom = r.nextInt(1700-50)+50;
		}
		return Movimentos;
	}
	
	MovimentoContas[] FClassMov (MovimentoContas[] Movimentos) {
		int Cont1, Cont2;
		MovimentoContas Aux[] = new MovimentoContas [1];
		
		for (Cont1=0; Cont1<9; Cont1++) {
			for (Cont2=Cont1+1;Cont2<10; Cont2++) {
				if (Movimentos[Cont1].Codcontam > Movimentos[Cont2].Codcontam) {
					Aux[0]=Movimentos[Cont1];
					Movimentos[Cont1]=Movimentos[Cont2];
					Movimentos[Cont2]=Aux[0];
				}
			}
		}
		return Movimentos;
	}
	
	void GravaMovimentos (MovimentoContas[] Movimentos) throws IOException{
		int Cont;
		String Arquivo = "Movimentos.txt";
		BufferedWriter Gravar = new BufferedWriter(new FileWriter(Arquivo));
		for (Cont=0; Cont<10; Cont++) {
			Gravar.write(Movimentos[Cont].Codcontam+"");
			Gravar.newLine();
			Gravar.write(Movimentos[Cont].Tipomovimentom+"");
			Gravar.newLine();
			Gravar.write(Movimentos[Cont].Statusm+"");
			Gravar.newLine();
			Gravar.write(Movimentos[Cont].Valormovimentom+"");
			Gravar.newLine();
		}
		Gravar.close();
	}
		
	ContasCorrente[] FAtualizaContas (ContasCorrente[] Contas, MovimentoContas[] Movimentos, ContasCorrente[] Atualizado) {
		int Cont1, Cont2;
		for (Cont1=0; Cont1<5; Cont1++) {
			for (Cont2=0; Cont2<10; Cont2++) {
				if (Contas[Cont1].Codcontac < Movimentos[Cont2].Codcontam) {
					Atualizado[Cont1]=Contas[Cont1];
					break;
				}
				else if (Contas[Cont1].Codcontac == Movimentos[Cont2].Codcontam) {
					if (Movimentos[Cont2].Statusm ==1) {
						Atualizado[Cont1]=Contas[Cont1];
						if (Movimentos[Cont2].Tipomovimentom ==1) {
							Atualizado[Cont1].Saldocontac += Movimentos[Cont2].Valormovimentom;
						}
						else {
							Atualizado[Cont1].Saldocontac -= Movimentos[Cont2].Valormovimentom;
						}
					}
					else {
						Atualizado[Cont1]=Contas[Cont1];
						if (Movimentos[Cont2].Tipomovimentom ==1) {
							Atualizado[Cont1].Saldocontac += Movimentos[Cont2].Valormovimentom;
						}
						else {
							if (Atualizado[Cont1].Saldocontac < Movimentos[Cont2].Valormovimentom) {
								if (Contas[Cont1].Tipocontac == 3) {
									Atualizado[Cont1].Limitecontac += (Contas[Cont1].Saldocontac*0.5);
									Atualizado[Cont1].Saldocontac -= Movimentos[Cont2].Valormovimentom;
								}
								else if (Contas[Cont1].Tipocontac == 4) {
									Atualizado[Cont1].Limitecontac += Contas[Cont1].Saldocontac;
									Atualizado[Cont1].Saldocontac -= Movimentos[Cont2].Valormovimentom;
								}
								else {
									Atualizado[Cont1].Saldocontac -= Movimentos[Cont2].Valormovimentom;
								}
							}
							else {
								Atualizado[Cont1].Saldocontac -= Movimentos[Cont2].Valormovimentom;
							}
						}
					}
				}
			}
		}
		return Atualizado;
	}
	
	void GravaAtualizacao (ContasCorrente[] Contas) throws IOException{
		int Cont;
		String Arquivo = "Atualizado.txt";
		BufferedWriter Gravar = new BufferedWriter(new FileWriter(Arquivo));
		for (Cont=0; Cont<5; Cont++) {
			Gravar.write(Contas[Cont].Codcontac+"");
			Gravar.newLine();
			Gravar.write(Contas[Cont].Tipocontac+"");
			Gravar.newLine();
			Gravar.write(Contas[Cont].NomeCliente+"");
			Gravar.newLine();
			Gravar.write(Contas[Cont].Saldocontac+"");
			Gravar.newLine();
			Gravar.write(Contas[Cont].Limitecontac+"");
			Gravar.newLine();
		}
		Gravar.close();
	}
	
	void ConsultaCadastros() throws IOException{
		int Opc;
		String Arquivo ="";
		do {
			Opc=Integer.parseInt(JOptionPane.showInputDialog("Consulta Cadastros\n\n1 - Contas Correntes\n2 - Movimentos\n3 - Atualizado\n9 - Fim"));
			switch (Opc) {
			case 1:
				Arquivo="Contas.txt";
				ConsultaContas(Arquivo);
				break;
			case 2:
				Arquivo="Movimentos.txt";
				ConsultaMovimentos(Arquivo);
				break;
			case 3:
				Arquivo="Atualizado.txt";
				ConsultaAtualizado(Arquivo);
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

	
	void ConsultaContas (String Arquivo) throws IOException {
		int Cont;
		String Tipo[] = {"física", "conjunta", "jurídica", "especial"};
		String Dados ="Informações das contas corrente:\n";
		ler = new BufferedReader (new FileReader (Arquivo));
		for (Cont=0; Cont<5; Cont++) {
			Dados += ("Código da conta: "+ler.readLine()+"\n");
			Dados += ("Tipo de conta: "+Tipo[Integer.parseInt(ler.readLine())-1]+"\n");
			Dados += ("Nome do Cliente: "+ler.readLine()+"\n");
			Dados += ("Saldo Conta: "+ler.readLine()+"\n");
			Dados += ("Limite Conta: "+ler.readLine()+"\n\n");
		}
		JOptionPane.showMessageDialog(null, Dados);
	}
	
	void ConsultaAtualizado (String Arquivo) throws IOException {
		int Cont;
		String Tipo[] = {"física", "conjunta", "jurídica", "especial"};
		String Dados ="Informações das contas corrente atualizado:\n";
		ler = new BufferedReader (new FileReader (Arquivo));
		for (Cont=0; Cont<5; Cont++) {
			Dados += ("Código da conta: "+ler.readLine()+"\n");
			Dados += ("Tipo de conta: "+Tipo[Integer.parseInt(ler.readLine())-1]+"\n");
			Dados += ("Nome do Cliente: "+ler.readLine()+"\n");
			Dados += ("Saldo Conta: "+ler.readLine()+"\n");
			Dados += ("Limite Conta: "+ler.readLine()+"\n\n");
		}
		JOptionPane.showMessageDialog(null, Dados);
	}
	
	void ConsultaMovimentos (String Arquivo) throws IOException {
		int Cont;
		String Tipo[] = {"Crédito", "Débito"};
		String Dados ="Informações dos movimentos realizados:\n";
		ler = new BufferedReader (new FileReader (Arquivo));
		for (Cont=0; Cont<10; Cont++) {
			Dados += ("Código da conta: "+ler.readLine()+"\n");
			Dados += ("Tipo de movimento: "+Tipo[Integer.parseInt(ler.readLine())-1]+"\n");
			Dados += ("Status: "+ler.readLine()+"\n");
			Dados += ("Valor do movimento: "+ler.readLine()+"\n\n");
		}
		JOptionPane.showMessageDialog(null, Dados);
	}
	
}