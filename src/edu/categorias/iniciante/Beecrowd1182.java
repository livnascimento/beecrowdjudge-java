package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1182 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[][] matriz = new float[12][12];
		
		int coluna = sc.nextInt(); 
		
		String t = sc.next();
		
		for (int i = 0 ; i < 12 ; i++) 
			for (int j = 0 ; j < 12 ; j++)
				matriz[i][j] = sc.nextFloat();
		
		if(t.equals("S"))
			soma(matriz, t, coluna);
		else if (t.equals("M"))
			media(matriz, t, coluna);
		
		sc.close();
	}
	
	static void soma(float[][] matriz, String t, int coluna) {
		
		float soma = 0;
		
		for (int i = 0 ; i < 12 ; i ++)
			soma += matriz[i][coluna];
		
		System.out.printf("%.1f\n", soma);
			
	}
	
	static void media(float[][] matriz, String t, int coluna) {
		
		float media = 0;
		
		for (int i = 0 ; i < 12 ; i ++)
			media += matriz[i][coluna];
		
		media /= 12;
		
		System.out.printf("%.1f\n",media);
		
	}

}
