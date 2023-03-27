package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1074 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] numeros = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			numeros[i] = sc.nextInt();
		}
		
		for (int i : numeros) {
			if (i == 0) {
				System.out.println("NULL");
			} else if (i % 2 == 0) {
				System.out.printf("EVEN ");
				
				String positivo = i > 0 ? "POSITIVE" : "NEGATIVE";
				
				System.out.println(positivo);
			} else {
				System.out.printf("ODD ");
				
				String positivo = i > 0 ? "POSITIVE" : "NEGATIVE";
				
				System.out.println(positivo);
			}
		}
		
		sc.close();
				
	}

}
