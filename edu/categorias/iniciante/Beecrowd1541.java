package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1541 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, tamanhoCasa, tamanhoTerreno, ladoTerreno;
		
		while (true) {
			
			a = sc.nextInt();
			if (a == 0) break;
			b = sc.nextInt();
			c = sc.nextInt();
			
			tamanhoCasa = a * b;
			tamanhoTerreno = (tamanhoCasa * 100) / c;
			ladoTerreno = (int) Math.sqrt(tamanhoTerreno);
			
			System.out.println(ladoTerreno);
			
			
		}
		
		sc.close();
	}

}
