package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1186 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[][] matriz = new float[12][12];
		
		String operacao = sc.next();
		
		for(int i = 0 ; i < 12 ; i ++)
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
		int temp = 0;
		
		for(int i = 11 ; i >= 0 ; i--) {
			for (int j = 11 ; j >= 0 ; j--)
				if (j > temp) {
					soma += matriz[i][j];
				}			
			temp++;
		}
		
		System.out.printf("%.1f\n", soma);
					
	}
	
	static void media(float[][] matriz) {
		float media = 0;
		int temp = 0;
		
		for(int i = 11 ; i >= 0 ; i--) {
			for (int j = 11 ; j >= 0 ; j--)
				if (j > temp) {
					media += matriz[i][j];
				}			
			temp++;
		}
		
		media /= 66.0;
		
		System.out.printf("%.1f\n", media);
	}
}
