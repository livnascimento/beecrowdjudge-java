package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1001 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a = ler.nextInt();
		int b = ler.nextInt();

		ler.close();

		System.out.println("X = " + (a + b));
	}

}
