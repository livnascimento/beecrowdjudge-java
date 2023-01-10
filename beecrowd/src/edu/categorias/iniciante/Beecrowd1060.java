package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1060 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double [] numeros = new double[6];
		int contador = 0;
		
		for (int i = 0 ; i < 6 ; i++) {
			numeros[i] = leitor.nextDouble();
		}
		
		for (double i : numeros) {
			if (i > 0)
				contador++;
		}
		
		System.out.printf("%d valores positivos\n", contador);
		
		leitor.close();
		
	}

}
