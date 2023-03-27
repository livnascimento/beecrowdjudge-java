package edu.categorias.iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Beecrowd1180 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		int entrada;
		
		for (int i = 1 ; i <= n ; i++) {
			entrada = sc.nextInt();
			numeros.add(entrada);
		}
		
		int menor = Collections.min(numeros);
		
		System.out.printf("Menor valor: %d\n", menor);
		System.out.printf("Posicao: %d\n", numeros.indexOf(menor));
		
		sc.close();
		
	}
	
}
