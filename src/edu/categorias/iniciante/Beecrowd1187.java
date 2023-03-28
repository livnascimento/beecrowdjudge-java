package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1187 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[][] matriz = new double[12][12];

		String operacao = sc.next();

		for (int i = 0; i < 12; i++)
			for (int j = 0; j < 12; j++)
				matriz[i][j] = sc.nextDouble();

		if (operacao.equals("S"))
			soma(matriz);
		else if (operacao.equals("M"))
			media(matriz);

		sc.close();

	}

	static void soma(double[][] matriz) {

		double soma = 0;
		int inicio = 0, fim = 11;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 12; j++)
				if (j > inicio && j < fim) 
					soma += matriz[i][j];

			inicio++;
			fim--;
		}

		System.out.printf("%.1f\n", soma);

	}

	static void media(double[][] matriz) {
		double media = 0;
		int inicio = 1, fim = 10;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 11; j++)
				if (j >= inicio && j <= fim)
					media += matriz[i][j];
			
			inicio++;
			fim--;
		}

		media /= 30.0;

		System.out.printf("%.1f\n", media);
	}

}
