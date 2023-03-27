package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1159 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, soma = 0;
		
		while (true) {
			x = sc.nextInt();
			
			if(x == 0)
				break;
			
			if (x % 2 != 0)
				x++;
			
			for (int i = 1; i <= 5 ; i++) {
				soma += x;
				x += 2;
			}
			
			System.out.println(soma);
			soma = 0;
		}
		
		sc.close();
		
	}

}
