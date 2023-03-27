package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1961 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int altura = sc.nextInt();
		int qtdCanos = sc.nextInt();
		
		int[] canos = new int[qtdCanos];
		boolean win = false;
		
		for (int i = 0 ; i < qtdCanos ; i++) 
			canos[i] = sc.nextInt();
		
		for (int i = 0 ; i < qtdCanos ; i++) {
			if (i < qtdCanos - 1) {				
				if (Math.abs(canos[i] - canos[i + 1]) <= altura)
					win = true;
				else {
					win = false;
					break;
				}
			}
		}
		
		if (win) System.out.println("YOU WIN");
		else System.out.println("GAME OVER");
		
		sc.close();
		
	}

}
