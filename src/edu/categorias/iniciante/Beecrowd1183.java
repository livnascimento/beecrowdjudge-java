package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1183 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[][] matriz = new float[12][12];
		
		String operacao = sc.next();
		
		for (int i = 0 ; i < 12 ; i++)
			for (int j = 0 ; j < 12 ; j++)
				matriz[i][j] = sc.nextFloat();
		
		if(operacao.equals("S"))
			soma(matriz);
		else if (operacao.equals("M"))
			media(matriz);
		
		sc.close();
		
	}
	
	static void soma(float[][] matriz) {
		
		float soma = 0;
		
		for (int i = 0 ; i < 12 ; i ++) {
			for (int j = 1 ; j < 12 ; j++) {
				if (j > i)
					soma += matriz[i][j];				
			}
		}
		
		System.out.printf("%.1f\n", soma);
	}
	
	static void media(float[][] matriz) {
		float media = 0;
		
		for (int i = 0 ; i < 12 ; i ++) {
			for (int j = 1 ; j < 12 ; j++) {
				if (j > i)
					media += matriz[i][j];			
			}
		}
		
		media /= 66.0;
		
		System.out.printf("%.1f\n", media);
		
	}

}
