package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1101 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y = 1, x = 1, soma = 0;
		
		while (true) {
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x <= 0 | y <= 0)
				break;
			
			if (x > y) {
				
				for (int i = y ; i <= x ; i++) {
					System.out.printf("%d ", i);
					soma += i;
				}
				
				System.out.printf("Sum=%d\n", soma);
				
			} else if (x < y) {
				for (int i = x ; i <= y ; i++) {
					System.out.printf("%d ", i);
					soma += i;
				}
				
				System.out.printf("Sum=%d\n", soma);
			}
			
			soma = 0;
			
		};
		
		
		sc.close();
		
	}

}
