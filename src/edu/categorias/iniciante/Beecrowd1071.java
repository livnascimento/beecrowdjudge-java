package edu.categorias.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1071 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;

		if (x > y) {
		 	
			for (int i = y; i <= x ; i++) {	
				if (i % 2 != 0  & i != x & i != y)
					soma += i;
			}
			
		} else {
			
			for (int i = x; i <= y ; i++)
				if (i % 2 != 0 & i != x & i != y)
					soma += i;
		}
		
		
		System.out.println(soma);
		
		sc.close();
		
	}


}
