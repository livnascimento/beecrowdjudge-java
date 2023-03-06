package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1150 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int X = sc.nextInt();
		int Z = validaZ(X);
		int soma = 0, contador = 0;
		
		for (int i = X ; soma <= Z ; i++) {
			soma += i;
			contador++;
		}
		
		System.out.println(contador);
		
		sc.close();
		
	}
	
	public static int validaZ(int x) {
		int z;
		
		while (true) {
			z = sc.nextInt();
			
			if(z > x)
				return z;
			else
				continue;
		}
		
	}

}
