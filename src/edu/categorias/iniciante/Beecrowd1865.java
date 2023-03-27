package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1865 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int forca;
		String nome;
		
		
		for (int i = 1; i <= c ; i++) {
			nome = sc.next();
			forca = sc.nextInt();
			
			if (nome.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
			
		}
		
		sc.close();
		
	}

}
