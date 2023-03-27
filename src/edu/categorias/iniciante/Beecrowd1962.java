package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1962 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			int anos = sc.nextInt();
			
			exibeAno(anos);
		}
		
		sc.close();
		
	}
	
	static void exibeAno(int anos) {
		
		int ano = 2015 - anos;
		StringBuilder str = new StringBuilder();
		
		
		if (ano <= 0) {
			str.append(Math.abs(ano) + 1);
			str.append(" A.C.");
		}
		else {
			str.append(ano);
			str.append(" D.C.");
		}
		
		System.out.println(str);
		
	}

}
