package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1116 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x, y;
		double resultado;
		
		for (int i = 1 ; i <= n ; i++) {
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
				continue;
			}
			
			resultado = (double) x / (double) y;
			System.out.printf("%.1f\n", resultado);
			
			
		}
		
		sc.close();
		
	}

}
