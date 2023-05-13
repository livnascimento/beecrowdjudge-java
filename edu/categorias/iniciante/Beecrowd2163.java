package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2163 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] matriz = new int [n][m];
		
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < m ; j++) {
				matriz[i][j] = sc.nextInt();
			}
 		}
		
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < m ; j++) {
				if (matriz[i][j] == 42) {
					if (i == matriz.length || j == matriz[0].length) break;
					if(confere(matriz, i, j)) {
						System.out.printf("%d %d\n", i+1, j+1);
						System.exit(0);
					}
				}
			}
 		}
		
		System.out.printf("0 0\n");
		
		sc.close();
		
	}
	
	public static boolean confere(int[][] matriz, int i, int j) {
		
		if (i == matriz.length || j == matriz[0].length) return false;
		
		if (matriz[i - 1][j-1] == 7 & matriz[i-1][j] == 7 & matriz[i-1][j+1] == 7) {
			if (matriz[i][j-1] == 7 & matriz[i][j+1] == 7) {
				if (matriz[i+1][j-1] == 7 & matriz[i+1][j] == 7 & matriz[i+1][j+1] == 7) {
					return true;
				}
			}
		}
		
		return false;
	}

}
