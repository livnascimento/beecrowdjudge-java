package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1165 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x;
		
		for (int i = 1 ; i <= n ; i++) {
			x = sc.nextInt();
			
			verificaPrimo(x);
			
		}
		
		sc.close();
		
	}
	
	public static void verificaPrimo(int x) {
		
		int divisores = 0;
		
		for (int i = 1 ; i <= x ; i++)
			if (x % i == 0)
				divisores++;
		
		System.out.printf((divisores == 2) ? "%d eh primo\n" : "%d nao eh primo\n", x);
		
	}

}
