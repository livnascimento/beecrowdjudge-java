package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		int in = 0, out = 0;
		
		int[] valores = new int[entrada];
		
		for(int i = 0 ; i < entrada ; i++) 			
			valores[i] = sc.nextInt();
		
		for (int i : valores) {
			if (i > 1 & i < 20) 
				in++;
			else
				out++;
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
		
	}
	
}
