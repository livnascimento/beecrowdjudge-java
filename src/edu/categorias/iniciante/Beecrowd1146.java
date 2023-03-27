package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1146 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada;

		do {
			String resultadoString = "";

			entrada = sc.nextInt();
			
			for (int i = 1; i < entrada; i++) {
				resultadoString += i + " ";
			}
			
			if(entrada > 0 ) {
				resultadoString += entrada;
				System.out.println(resultadoString);				
			}

		} while (entrada != 0);

		sc.close();

	}

}
