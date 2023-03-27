package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1073 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int quadrado;
		
		if (n > 5 & n < 2000) {
			
			for(int i = 2 ; i <= n ; i +=2 ) {
				
				quadrado = i * i;
				
				System.out.printf("%d^2 = %d\n", i, quadrado);
				
			}
					
		}
		
		sc.close();
		
	}
	
}
