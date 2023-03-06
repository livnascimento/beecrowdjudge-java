package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1002 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double raio = ler.nextDouble();

		ler.close();

		double area = raio * raio * 3.14159;

		System.out.println(String.format("A=%.4f", area));
		
	}
	
}
