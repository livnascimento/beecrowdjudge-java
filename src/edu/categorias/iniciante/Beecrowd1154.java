package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1154 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade, soma = 0, contador = 0;
		double media;
		
		while (true) {
			
			idade = sc.nextInt();
			
			if (idade < 0)
				break;
			else {
				soma += idade;
				contador++;
			}
			
		}
		
		media = (double) soma / (double) contador;
		System.out.printf("%.2f\n", media);
		
		sc.close();
		
	}

}
