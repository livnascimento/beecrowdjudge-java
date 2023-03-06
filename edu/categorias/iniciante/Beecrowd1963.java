package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1963 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco1 = sc.nextDouble();
		double preco2 = sc.nextDouble();
		
		double aumento = preco2 - preco1;

		double percentual = (aumento / preco1) * 100;
		
		System.out.printf("%.2f%%\n", percentual);
		
		sc.close();
		
	}

}
