package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1145 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int temp = 0;

		for (int i = 1; i <= y; i++) {
			temp++;

			if (temp == x) {
				System.out.printf("%d", i);
				System.out.println("");
				temp = 0;
			} else {
				System.out.printf("%d ", i);
			}

		}

		sc.close();

	}

}
