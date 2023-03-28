package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2159 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		double p, m;
		
		p = numero /Math.log(numero);
		m = 1.25506*(p);
		
		System.out.printf("%.1f %.1f\n", p, m);
		
		sc.close();
		
	}

}
