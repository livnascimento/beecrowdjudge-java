package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1957 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		
		String vHexa = Integer.toHexString(v);
			
		System.out.println(vHexa.toUpperCase());
		
		sc.close();
		
	}

}
