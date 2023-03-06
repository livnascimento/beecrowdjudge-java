package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1933 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int carta1 = sc.nextInt();
		int carta2 = sc.nextInt();
		int carta3 = -1;

		if (carta1 == carta2)
			carta3 = carta1;
		else if (carta1 > carta2)
			carta3 = carta1;
		else if (carta1 < carta2)
			carta3 = carta2;

		System.out.println(carta3);

		sc.close();
		
	}

}
