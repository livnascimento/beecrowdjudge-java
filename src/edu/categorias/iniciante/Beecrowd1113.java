package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1113 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		while (true) {
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > y)
				System.out.println("Decrescente");
			else if (y > x) 
				System.out.println("Crescente");
			else if (x == y) 
				break;
			
		}
		
		
		sc.close();
		
	}

}
