package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1114 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int SENHA = 2002;
		int senha = 0;
		
		while (true) {
			senha = sc.nextInt();
			
			if (senha != SENHA)
				System.out.println("Senha Invalida");
			else 
				break;
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
		
	}
}
