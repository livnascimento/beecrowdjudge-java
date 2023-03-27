package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1078 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int multiplicado;
		
		for (int i = 1 ; i <= 10 ; i++) {
			multiplicado = i * n;
			System.out.printf("%d x %d = %d\n", i, n, multiplicado);
		}
		
		sc.close();
		
	}

}
