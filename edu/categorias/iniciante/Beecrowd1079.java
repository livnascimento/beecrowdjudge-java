package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1079 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		float a, b, c, media;
		
		for (int i = 1 ; i <= n ; i++) {
			
			a = sc.nextFloat();
			b = sc.nextFloat();
			c = sc.nextFloat();
			
			media = ((a*2) + (b*3) + (c*5)) / (10);
			
			System.out.printf("%.1f\n", media);
			
		}
		
		sc.close();
		
	}

}
