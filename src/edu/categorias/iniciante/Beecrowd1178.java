package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1178 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] N = new double[100];
		double x = sc.nextDouble();
		
		for (int i = 0 ; i < N.length ; i++) {
			N[i] = x;
			x /= 2;
		}
		
		for (int i = 1 ; i < N.length ; i++) {
			System.out.printf("N[%d] = %.4f\n", i, N[i]);
		}
				
		sc.close();
		
	}

}
