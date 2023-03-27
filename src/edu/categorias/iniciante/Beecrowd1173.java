package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1173 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[10];
		
		int primeiraPosicao = sc.nextInt();
		N[0] = primeiraPosicao;
		
		for (int i = 1 ; i < 10 ; i++) {
			N[i] = N[i-1] * 2;
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.printf("N[%d] = %d\n", i, N[i]);
		}
		
		sc.close();
	}

}
