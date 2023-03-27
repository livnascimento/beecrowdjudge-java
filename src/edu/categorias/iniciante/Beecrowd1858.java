package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1858 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] golpes = new int[n];
		int menor = 21, posicao = 0;
		
		for (int i = 0 ; i < n ; i++) {
			golpes[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n ; i++) {
			if (golpes[i] < menor) {
				menor = golpes[i];
				posicao = i+1;
			}
		}
		
		System.out.println(posicao);
		
		sc.close();
		
	}

}
