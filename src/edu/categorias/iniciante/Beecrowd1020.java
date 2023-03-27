package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1020 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
        int idadeEmDias = ler.nextInt();
        
        int anos, meses, dias;
        
        if (idadeEmDias % 365 == idadeEmDias){
            anos = 0;
        } else {
            anos = idadeEmDias / 365;
            idadeEmDias %= 365;
        }
        
        if (idadeEmDias % 30 == idadeEmDias){
            meses = 0;
        } else {
            meses = idadeEmDias / 30;
            idadeEmDias %= 30;
        }
        
        dias = idadeEmDias;
        
        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);
 
        ler.close();
        
	}

}
