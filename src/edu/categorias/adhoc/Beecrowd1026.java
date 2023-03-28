package edu.categorias.adhoc;

import java.util.Scanner;

public class Beecrowd1026 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		long a, b, resultado;
		
		while (leitor.hasNext()) {
			a = leitor.nextLong();
			b = leitor.nextLong();
			
			resultado = a ^ b; // o ou exclusivo (representado pelo ^) compara cada bit do número, 
							   // somando apenas os que retornam 1/true (1 e 0 ou 0 e 1).
							   // assim 1 e 1 não são somandos, fazendo o mesmo trabalho do carry da questão
			
			System.out.println(resultado);
		}
		
		leitor.close();
		
	}

}
