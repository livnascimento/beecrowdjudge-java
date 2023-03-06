package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2028 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int caso = 0, N, qtdNumeros;
		
		while(sc.hasNext()) {
			
			str.delete(0, str.length());
			qtdNumeros = 0;
			N = sc.nextInt();
			caso++;
			
			if (N == 0) {
				qtdNumeros = 1;
				System.out.printf("Caso %d: %d numero\n", caso, qtdNumeros);
				str.append(0);
			} else {
				
				for (int i = 0 ; i <= N ; i++) {
					if (i == 0)	{
						qtdNumeros += 1;
						str.append(i + " ");
					}
					else qtdNumeros += i;
						
					for (int j = 0 ; j < i ; j++) {
						str.append(i);
						if (!(i == N & j == i - 1)) str.append(" ");
						
					}
					
					
				}
				
				System.out.printf("Caso %d: %d numeros\n", caso, qtdNumeros);
				
			}
			
			System.out.println(str);
			System.out.println();
		}
				
		sc.close();
		
	}

}
