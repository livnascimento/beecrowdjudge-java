package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1160 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int populacaoA, populacaoB, tempo;
		double crescimentoA, crescimentoB;
		
		for (int i = 0 ; i < t ; i++) {
			
			populacaoA = sc.nextInt();
			populacaoB = sc.nextInt();
			crescimentoA = sc.nextDouble();
			crescimentoB = sc.nextDouble();
			
			tempo = calculaTempo(populacaoA, populacaoB, crescimentoA, crescimentoB);
			
			if (tempo <= 100)
				System.out.printf("%d anos.\n", tempo);
			else
				System.out.println("Mais de 1 seculo.");
		}
		
		
		sc.close();
		
	}
	
	public static int calculaTempo(int populacaoA, int populacaoB, double crescimentoA, double crescimentoB) {
		
		int anos = 0;
		
		while (true) {
			populacaoA +=  (int) Math.floor(populacaoA * (crescimentoA / 100));
			populacaoB += (int) Math.floor(populacaoB * (crescimentoB / 100));
			anos++;
			
			if(populacaoA <= populacaoB)
				continue;
			else
				return anos;
		}
		
	}

}
