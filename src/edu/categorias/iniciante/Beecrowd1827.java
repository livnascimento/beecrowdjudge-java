package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1827 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {			
			int ordem = sc.nextInt();
			int[][] matriz = new int[ordem][ordem];
			
			formaMatriz(ordem, matriz);
			imprimeMatriz(matriz);
			System.out.println();
		}
		
		
		sc.close();
	}
	
	static void formaMatriz( int ordem, int[][] matriz) {
		
		int distancia = (int) ordem / 3, distanciaJ, distanciaI = distancia, meio = (int) ordem / 2;
		boolean incrementaI = false;
		
		for (int i = 0 ; i < ordem ; i ++) {
			distanciaJ = (int) ordem / 3;
			incrementaI = false;
			for (int j = 0 ; j < ordem ; j++) {
				matriz[i][j] = 0;
				if (i == j)	matriz[i][j] = 2;
				if (i + j == ordem - 1)	matriz[i][j] = 3;
				if (j == distanciaJ & i == distanciaI) {
					matriz[i][j] = 1;
					incrementaI = true;
					if (distanciaJ + 1 < ordem -  distancia)	distanciaJ++;
				}
				if (i == meio & j == meio)	matriz[i][j] = 4;
			}
			if (incrementaI & i + 1 < ordem - distancia) distanciaI++;
		}
		
		
	}
	
	static void imprimeMatriz(int[][] matriz) {
		StringBuilder linha = new StringBuilder();
		
		for (int i = 0 ; i < matriz.length ; i ++) {
			linha.delete(0, linha.length());
			for (int j = 0 ; j < matriz.length ; j++) {
				linha.append(matriz[i][j]);
			}
			System.out.println(linha);
		}
	}

}
