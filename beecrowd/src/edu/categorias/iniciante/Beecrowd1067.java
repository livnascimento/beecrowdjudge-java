package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1067 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		for (int i = 1 ; i <= numero; i += 2)
			System.out.println(i);
		
		sc.close();
		
	}
	
}
