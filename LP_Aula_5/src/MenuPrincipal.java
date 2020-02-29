/*
********************************************************************************
Objetivo    :Carregar um vetor com 5 valores, classificar utilizando bubblesort e mostrar o vetor classificado
Programador :Julio Barcellos
Data criação: 07/02/2019
********************************************************************************
 */

import javax.swing.*;
public class MenuPrincipal {
    public static void main (String args[]) {
        int v[] = new  int[5];
        int opc = 0;
      do {
        opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar vetor\n2 - Classificar vetor \n3 - Mostrar vetor\n9 - Finalizar"));
            
            switch (opc)
            {
                  case 1: v = FunçãoCarrega(v);
                               break;
                  case 2: v = FunçãoClassifica(v);
                               break;
                  case 3: ProcedimentoMostra(v);
                               break;
                  case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                               break;
                  default: JOptionPane.showMessageDialog(null,"opc inválida");
            }
      }
      while(opc != 9);
     
    }
    
    static int[] FunçãoCarrega(int v[]) {
    
        int  i;

        for(i=0; i<5; i++) {
    
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i+1) + "o elemento do vetor."));
        }

        return v;
    }
    
    static int[] FunçãoClassifica(int v[]) {
        int i, j, aux;
        
        for(i=0; i<4; i++) {
            for(j=i+1; j<5; j++) {
                if(v[i]>v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        
        return v;
    }
    
    static void ProcedimentoMostra(int v[]) {
        //System.out.println("O vetor é:\n");
        String mostra="";
        for (int i=0; i<5; i++) { 
            //System.out.println(v[i]);
            mostra += ("\t "+v[i]);
        }
        JOptionPane.showMessageDialog(null,mostra);
    }
}




