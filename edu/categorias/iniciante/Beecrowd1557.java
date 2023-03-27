package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1557 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ordem;
		
		while (true) {
			
			ordem = sc.nextInt();
			if (ordem == 0) break;
			else imprimeMatriz(ordem);
			System.out.println();
			
		}
		
		sc.close();
		
	}
	
	static void imprimeMatriz (int ordem) {
		
		int soma, potenciacao, maior = (int) Math.pow(2, (ordem-1)*2), digitos = (int)Math.floor(Math.log10(maior) + 1);
		String formatada;
		StringBuilder linha = new StringBuilder();
		
		for (int i = 0 ; i < ordem ; i++) {
			linha.delete(0, linha.length());
			for (int j = 0 ; j < ordem ; j++) {
				
				soma = i + j;
				potenciacao = (int) Math.pow(2, soma);
				formatada = String.format("%" + digitos + "d", potenciacao);
				linha.append(formatada);
				
				if (j == ordem - 1) linha.append("\n");
				else linha.append(" ");
				
			}
			System.out.print(linha);
		}
		
	}

}
