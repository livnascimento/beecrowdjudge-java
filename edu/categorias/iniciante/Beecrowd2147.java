package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2147 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str;
		double tempo;
		
		for (int i = 0 ; i < n ; i++) {
			str = sc.next();
			tempo = str.length() * 0.01;
			System.out.printf("%.2f\n", tempo);
		}
		
		sc.close();
	}

}
