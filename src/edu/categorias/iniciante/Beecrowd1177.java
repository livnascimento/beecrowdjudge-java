package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1177 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] N = new int[1000];
		int temp = 0;
		
		for (int i = 0 ; i < N.length ; i++) {
			if (temp > t - 1)
				temp = 0;
			N[i] = temp;
			temp++;
		}
		
		for (int i = 0 ; i < N.length ; i++) {
			System.out.printf("N[%d] = %d\n", i, N[i]);
		}
		
		sc.close();
		
	}

}
