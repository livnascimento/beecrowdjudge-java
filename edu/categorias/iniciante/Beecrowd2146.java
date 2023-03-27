package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2146 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		while (sc.hasNext()) {
			
			senha = sc.nextInt();
			
			System.out.println(--senha);
			
		}
		
		sc.close();
		
	}

}
