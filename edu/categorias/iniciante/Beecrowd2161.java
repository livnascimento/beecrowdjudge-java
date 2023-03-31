package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2161 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int contador = 3;
		double resultado;
				
		if (n == 0)	resultado = contador;
		else {
			resultado = contador;
			contador *= 2;
			for (int i = 0 ; i < n ; i++) {
				resultado += 1/contador;
			}
		}
		
		System.out.printf("%.10f\n", resultado);
		
		sc.close();
		
	}

}
