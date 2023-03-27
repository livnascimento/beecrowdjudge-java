package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1065 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		int contador = 0;
		
		for (int i = 0 ; i < 5 ; i++) {
			numeros[i] = sc.nextInt();
		}
		
		for (int i : numeros) {
			if (i % 2 == 0)
				contador++;
		}
		
		System.out.println(contador + " valores pares");
		
		sc.close();
		
	}

}
