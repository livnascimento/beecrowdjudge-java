package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1930 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		int t4 = sc.nextInt();

		int tomadas = t1 + t2 + t3 + t4 - 3;

		System.out.println(tomadas);

		sc.close();
	}

}
