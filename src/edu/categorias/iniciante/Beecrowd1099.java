package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1099 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for (int i = 1 ; i <= casos ; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int impares = 0;
			
			if (x > y) {
				y += 1;
				for (int j = y; j < x ; j++)
					if (j % 2 != 0)
						impares += j;
			} else if (x < y) {
				x += 1;
				for (int j = x; j < y ; j++)
					if (j % 2 != 0)
						impares += j;
			}
			
			System.out.println(impares);	
			
		}
		
		sc.close();
		
	}

}
