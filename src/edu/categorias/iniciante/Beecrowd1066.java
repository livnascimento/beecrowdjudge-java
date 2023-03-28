package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1066 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[5];
		int pares = 0, impares = 0, positivos = 0, negativos = 0;

		for (int i = 0; i < 5; i++)
			numeros[i] = sc.nextInt();

		for (int i : numeros) {
			if (i % 2 == 0)
				pares++;
			else
				impares++;

			if (i > 0 )
				positivos++;
			else if (i < 0)
				negativos++;
		}
		
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");

		sc.close();
		
	}
}
