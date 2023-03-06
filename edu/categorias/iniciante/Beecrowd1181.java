package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1181 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[][] matriz = new float[12][12];
		
		int linha = sc.nextInt(); 
		
		String t = sc.next();
		
		for (int i = 0 ; i < 12 ; i++) 
			for (int j = 0 ; j < 12 ; j++)
				matriz[i][j] = sc.nextFloat();
		
		if(t.equals("S"))
			soma(matriz, t, linha);
		else if (t.equals("M"))
			media(matriz, t, linha);
		
		sc.close();
	}
	
	static void soma(float[][] matriz, String t, int linha) {
		
		float soma = 0;
		
		for (int i = 0 ; i < 12 ; i ++)
			soma += matriz[linha][i];
		
		System.out.println(soma);
			
	}
	
	static void media(float[][] matriz, String t, int linha) {
		
		float media = 0;
		
		for (int i = 0 ; i < 12 ; i ++)
			media += matriz[linha][i];
		
		media /= 12;
		
		System.out.println(media);
		
	}

}
