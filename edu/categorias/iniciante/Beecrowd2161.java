package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2161 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double resultado = 0;
		
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			resultado = 1.0 / (resultado + 6.0);
		}
		resultado += 3.0;

		System.out.printf("%.10f\n", resultado);

		sc.close();

	}

}
