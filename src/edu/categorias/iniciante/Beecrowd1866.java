package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1866 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int n;
		
		for (int i = 0 ; i < c ; i++) {
			n = sc.nextInt();
			
			if (n % 2 == 0) System.out.println("0");
			else System.out.println("1");
		}
		
		sc.close();
		
	}

}
