package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1174 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[] A = new float[100];
		
		for (int i = 0 ; i < 100 ; i++) {
			A[i] = (float) sc.nextFloat();
		}
		
		for (int i = 0 ; i < 100 ; i++) {
			if (A[i] <= 10.0)
				System.out.printf("A[%d] = %.1f\n", i, A[i]);
		}
		
		sc.close();
		
	}

}
