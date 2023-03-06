package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1789 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int l = sc.nextInt();
			
			int maior = -1, nivel = 0;
			int[] velocidades = new int[l];
			
			for(int i = 0 ; i < l ; i++) {
				velocidades[i] = sc.nextInt();
			}
			
			for (int i : velocidades) {
				if (i > maior)
					maior = i;
			}
			
			if(maior < 10) nivel = 1;
			else if (maior >= 10 & maior < 20) nivel = 2;
			else if (maior >= 20) nivel = 3;
			
			System.out.println(nivel);
			
		}
		
		sc.close();
		
	}

}
