package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1004 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a = ler.nextInt();
		int b = ler.nextInt();

		ler.close();

		int PROD = a * b;

		System.out.println("PROD = " + PROD);
	}

}
