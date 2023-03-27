package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2061 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int abas = sc.nextInt();
		int acoes = sc.nextInt();
		
		String[] sequenciaAcoes = new String[acoes];
		
		for (int i = 0 ; i < acoes ; i++)
			sequenciaAcoes[i] = sc.next();
		
		for (String string : sequenciaAcoes) {
			if (string.equals("fechou")) abas++;
			else if (string.equals("clicou")) abas--;
		}
		
		System.out.println(abas);
		
		sc.close();
		
	}

}
