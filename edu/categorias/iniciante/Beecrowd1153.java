package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1153 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fatorial = 1;
		
		for (int i = n ; i > 0 ; i--) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
		
	}

}
