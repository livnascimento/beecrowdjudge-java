package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1070 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int[] impares = new int[6];
		int aux;
		
		if (numero % 2 == 0)
			aux = numero + 1;
		else
			aux = numero;
		
		for (int i = 0 ; i < 6 ; i++) {			
			impares[i] = aux;
			aux += 2;
		}
		
		for (int i : impares) {
			System.out.println(i);
		}
		
		sc.close();
		
	}
	
}
