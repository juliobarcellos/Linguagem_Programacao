package Modularização;

/*
********************************************************************************
Objetivo    :Receba a data de nascimento e atual em ano, mês e dia. 
Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos. 

Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
*/

import java.util.Calendar;
import javax.swing.*;

public class Lt01_Mod30{
	
	static int NDiaN=0, NDiaA=0, AnoT=0, MesT=0, DiaT=0;
	
	public static void main(String args [])
    {
		Calendar cal = Calendar.getInstance();
		int AnoN=0, MesN=0, DiaN=0, AnoA = cal.get(Calendar.YEAR), MesA= (cal.get(Calendar.MONTH)+1), DiaA= cal.get(Calendar.DAY_OF_MONTH);
       
		
       do {
    	   AnoN= Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento com 4 dígitos: "));
    	   if (AnoN> AnoA|| AnoN<1){
    		   JOptionPane.showMessageDialog(null, "Valor incorreto, ano precisa ser entre 0001 e "+AnoA); 
    	   }
       }
       while (AnoN> AnoA);
       
       do {
    	   MesN= Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento com 2 dígitos: "));
    	   if (AnoN==AnoA && MesN> MesA){	
    		   JOptionPane.showMessageDialog(null, "Valor incorreto, Se o ano de nascimento é igual ao ano atual, o mês de nascimento não pode ser maior que o atual"); 
    	   }
    	   if (MesN>12 || MesN<1){
    		   JOptionPane.showMessageDialog(null, "Valor incorreto, mês precisa ser entre 01 e 12"); 
    	   }
       }
       while (AnoN==AnoA && MesN> MesA || MesN>12 || MesN<1);
       
       PNDias(AnoN, AnoA, MesN, MesA);
       
       do {
    	   DiaN= Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento com 2 dígitos: "));
    	   if (AnoA==AnoN && MesN==MesA && DiaN> DiaA){	
    		   JOptionPane.showMessageDialog(null, "Valor incorreto, Se o ano e mês de nascimento são iguais ao ano e mês atual, o dia de nascimento não pode ser maior que o atual"); 
    	   }
    	   if (DiaN> NDiaN || DiaN<1){
    		   JOptionPane.showMessageDialog(null, "Valor incorreto, dia precisa ser entre 01 e "+NDiaN); 
    	   }
       }
       while ((AnoA==AnoN && MesN==MesA && DiaN> DiaA) || (DiaN> NDiaN|| DiaN<1));
       
       Calcula (AnoA, AnoN, MesA, MesN, DiaA, DiaN);
       JOptionPane.showMessageDialog(null, FIdade());
    }
	
	static void PNDias (int AnoN, int AnoA, int MesN, int MesA) {
		
		if (MesN== 1 || MesN==3 || MesN==5 || MesN==7 || MesN==8 || MesN==10 || MesN==12){
	    	   NDiaN=31;
	    	   }
	       else if (MesN==4 || MesN==6 || MesN==9 || MesN==11){
	    	   NDiaN=30;
	    	   }
	       else if (AnoN%4==0 || AnoN%400==0){
	    	   NDiaN=29;
	    	   }
	       else{
	    	   NDiaN=28;
	    	   }  
	       if (MesA==1 || MesA==3 || MesA==5 || MesA==7 || MesA==8 ||MesA==10 || MesA==12){
	    	   NDiaA=31; 
	    	   }
	       else if (MesA==4 || MesA==6 || MesA==9 || MesA==11){
	    		   NDiaA=30;
	    	   }
	       else if (AnoA%4==0 || AnoA%400==0){
	    		   NDiaA=29;
	    	   }
	       else{
	    		   NDiaA=28;
	    	   }
	}
	
       
    static void Calcula (int AnoA, int AnoN, int MesA, int MesN, int DiaA, int DiaN) {
       if ((AnoA>AnoN)&&(MesA<MesN)&&(DiaA<DiaN)){
    	   AnoT=((AnoA-AnoN)-1);
    	   MesT=((MesA-MesN)+11);
    	   DiaT=((DiaA-DiaN)+NDiaA);
       }
       else if ((AnoA>AnoN)&&(MesA<MesN)&&(DiaA>=DiaN)) {
    	   AnoT=((AnoA-AnoN)-1);
    	   MesT=((MesA-MesN)+12);
    	   DiaT=(DiaA-DiaN);
       }
       else if ((AnoA>AnoN)&&(MesA==MesN)&&(DiaA<DiaN)) {
    	   AnoT=((AnoA-AnoN)-1);
    	   MesT=((MesA-MesN)+11);
    	   DiaT=((DiaA-DiaN)+NDiaA);
       }
       else if ((AnoA>=AnoN)&&(MesA>MesN)&&(DiaA<DiaN)) {
    	   AnoT=(AnoA-AnoN);
    	   MesT=((MesA-MesN)-1);
    	   DiaT=((DiaA-DiaN)+NDiaA);
       }
       else {
    	   AnoT=(AnoA-AnoN);
    	   MesT=(MesA-MesN);
    	   DiaT=(DiaA-DiaN); 
       }
    }
       
    static String FIdade () {
    	String Idade="";
    	
       if (AnoT==1) {
    	   Idade+=(AnoT+" Ano, ");
       }
       else {
    	   Idade+=(AnoT+" Anos, ");
       }
       if (MesT==1) {
    	   Idade+=(MesT+" Mês, ");
       }
       else {
    	   Idade+=(MesT+" Meses, ");
       }
       if (DiaT==1) {
    	   Idade+=(DiaT+" Dia de vida");
       }
       else {
    	   Idade+=(DiaT+" Dias de vida");
       }
       if ((AnoT==0)&&(MesT==0)&&(DiaT==0)){
    	   Idade=("Nasceu hoje!"); 
       }
       return Idade;
    }
		
}