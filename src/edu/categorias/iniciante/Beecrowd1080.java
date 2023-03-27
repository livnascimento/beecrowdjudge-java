package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1080 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;

		int maior = -1, posicao = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			numero = sc.nextInt();
			
			
			if (numero > maior) {
				maior = numero;
				posicao = i;
			}
			
		}
							
		System.out.println(maior);
		System.out.println(posicao);
		
		sc.close();
		
	}

}
