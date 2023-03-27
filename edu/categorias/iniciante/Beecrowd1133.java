package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1133 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int maior = 0, menor = 0;
		
		if (x > y) {
			maior = x;
			menor = y;
		} else if (x < y) {
			maior = y;
			menor = x;
		}
		
		confereResto(maior, menor);
		
		sc.close();
	}
	
	public static void confereResto(int maior, int menor) {
		
		for (int i = menor + 1 ; i < maior ; i ++) 
			if (i % 5 == 2 | i % 5 == 3) 
				System.out.println(i);
				
	}

}
