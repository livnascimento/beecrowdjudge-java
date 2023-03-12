package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1064 {
	
	public static void main(String[] args) {
		
		double[] numeros = new double[6];
		double media = 0;
		int inteiros = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < 6 ; i++) {
			numeros[i] = sc.nextDouble();
		}
		
		for (double d : numeros) {
			
			if (d > 0) {
				inteiros++;
				media += d;				
			}
				
		}
		
		media /= inteiros;
		
		System.out.printf("%d valores positivos\n", inteiros);
		System.out.printf("%.1f\n", media);
		
		sc.close();
		
	}

}
