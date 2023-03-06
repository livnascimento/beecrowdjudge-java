package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1959 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		long resultado = n * l;
		int perimetro = (int) resultado;

		
		System.out.println(Integer.toUnsignedString(perimetro));
		
		sc.close();
	}

}
