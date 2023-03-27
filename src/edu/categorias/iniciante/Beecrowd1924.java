package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1924 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] cursos = new String[n];
		
		for (int i = 0 ; i < n ; i++) {
			cursos[i] = sc.next();
		}
		
		System.out.println("Ciencia da Computacao");
		
		sc.close();
		
	}

}
