package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1435 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ordem;
		
		while (true) {
			ordem = sc.nextInt();
			if (ordem == 0)
				break;
			
			int[][] matriz = new int[ordem][ordem];
			
			preencheMatriz(matriz, ordem);
			System.out.println();
		}
		
		sc.close();
	}
	
	static void preencheMatriz(int[][] matriz, int ordem) {
		
		int distancia;
		
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz.length ; j++) {
				
				distancia = i;
				
				if (j < distancia) distancia = j;
				if (ordem - i - 1 < distancia) distancia = ordem - i - 1;
				if (ordem - j - 1 < distancia) distancia = ordem - j - 1;
				
					System.out.printf("%3d", distancia + 1);
				if (j == matriz.length -1) System.out.println();
				else System.out.printf(" ");
				
			}
		}
	}
	

}
