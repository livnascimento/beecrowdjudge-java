package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2162 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] picosVales = new int[n];

		for (int i = 0; i < n; i++)
			picosVales[i] = sc.nextInt();

		boolean padrao = conferePadrao(picosVales);

		if (padrao == true)
			System.out.println(1);
		else
			System.out.println(0);

		sc.close();

	}

	static boolean conferePadrao(int[] picosVales) {
		
		
		
		return true;
	}

}
