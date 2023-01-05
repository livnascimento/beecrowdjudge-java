package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1006 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();
        
        ler.close();
        
        double MEDIA = ((A*2) + (B*3) + (C*5)) / (2 + 3 + 5);
        
        System.out.printf("MEDIA = %.1f\n", MEDIA);
		
	}
	
}
