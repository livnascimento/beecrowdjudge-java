package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1164 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x;
		
		for (int i = 1 ; i <= n ; i++) {
			x = sc.nextInt();
			
			verificaPerfeito(x);
			
		}
		
		sc.close();
	}
	
	public static void verificaPerfeito (int x) {
		int soma = 0;
		
		for (int i = 1 ; i < x ; i ++) 
			if (x % i == 0)
				soma += i;
		
		System.out.printf((soma == x) ? "%d eh perfeito\n" : "%d nao eh perfeito\n", x);
	}

}
