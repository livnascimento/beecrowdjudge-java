package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1958 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double X = sc.nextDouble();
				
		System.out.printf(String.valueOf(X).startsWith("-") ? "" : "+");
		System.out.printf("%.4E\n", X);
		
		sc.close();
	}

}
