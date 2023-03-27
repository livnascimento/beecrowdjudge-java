package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2060 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		StringBuilder saida = new StringBuilder();
		int[] numeros = new int[n];
		
		for (int i = 0 ; i < n ; i++)
			numeros[i] = sc.nextInt();
			
		int multiplos2 = 0, multiplos3 = 0, multiplos4 = 0, multiplos5 = 0;
		
		for (int i : numeros) {
			if (i % 2 == 0) multiplos2++;
			if (i % 3 == 0) multiplos3++;
			if (i % 4 == 0) multiplos4++;
			if (i % 5 == 0) multiplos5++;
		}
		
		saida.append(multiplos2 + " Multiplo(s) de 2\n");
		saida.append(multiplos3 + " Multiplo(s) de 3\n");
		saida.append(multiplos4 + " Multiplo(s) de 4\n");
		saida.append(multiplos5 + " Multiplo(s) de 5\n");
		
		System.out.print(saida);
		
		sc.close();
	}

}
