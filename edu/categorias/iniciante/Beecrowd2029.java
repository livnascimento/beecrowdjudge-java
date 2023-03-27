package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2029 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double volume, diametro, raio, pi = 3.14, altura, area;
		
		while(sc.hasNext()) {
			
			volume = sc.nextDouble();
			diametro = sc.nextDouble();
			raio = diametro/2;
			
			area = pi * Math.pow(raio, 2);
			altura = volume / area;
			
			
			System.out.printf("ALTURA = %.2f\n", altura);
			System.out.printf("AREA = %.2f\n", area);
			
		}
		
		sc.close();
		
	}

}
