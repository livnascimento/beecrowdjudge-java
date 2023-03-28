package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1564 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int reclamacoes;
		
		while (sc.hasNext()) {
			
			reclamacoes = sc.nextInt();
			
			if (reclamacoes == 0) System.out.println("vai ter copa!");
			else System.out.println("vai ter duas!");
		}
		
		sc.close();
		
	}

}
