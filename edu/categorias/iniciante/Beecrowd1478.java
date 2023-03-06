package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1478 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ordem;
		
		while (true) {
			ordem = sc.nextInt();
			if (ordem == 0)
				break;
			
			int[][] matriz = new int[ordem][ordem];
			
			preencheMatriz(matriz);
			System.out.println();
		}
		
		sc.close();
	}
	
	static void preencheMatriz(int[][] matriz) {
		
		int diferenca;
		String formatada;
		StringBuilder linha = new StringBuilder();
		
		for (int i = 0 ; i < matriz.length ; i++) {
			linha.delete(0, linha.length());
			for (int j = 0 ; j < matriz.length ; j++) {
				
				diferenca = j - i;
				if (i > j) diferenca = i - j;
				
				formatada = String.format("%3d", diferenca + 1);
				
				linha.append(formatada);
				if (j != matriz.length - 1)  linha.append(" ");
			}
			System.out.println(linha.toString());
		}
	}

}
