package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1132 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int soma = somaNaoMultiplos(x, y);
		
		System.out.println(soma);
		
	}
	
	public static int somaNaoMultiplos(int x, int y) {
		
		int soma = 0;
		
		if (x > y) {
			for (int i = y ; i <= x ; i++) {
				if (i % 13 != 0)
					soma += i;
			}
		} else if (x < y) {
			for (int i = x ; i <= y ; i++) {
				if (i % 13 != 0)
					soma += i;
			}
		}
		
		return soma;
		
	}
	
}
