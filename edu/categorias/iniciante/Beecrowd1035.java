package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1035 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C = leitor.nextInt();
		int D = leitor.nextInt();

		if (B > C && D > A) {
			if ((C + D) > (A + B)) {
				String positivos = C > 0 && D > 0 && A % 2 == 0 ? "Valores aceitos" : "Valores nao aceitos";
				System.out.println(positivos);
			} else {
				System.out.println("Valores nao aceitos");
			}
		} else {
			System.out.println("Valores nao aceitos");
		}

		leitor.close();

	}

}
