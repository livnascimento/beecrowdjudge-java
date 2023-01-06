package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1038 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double []  precos = { 4.0, 4.5, 5.0, 2.0, 1.5};
		
		int codigo = leitor.nextInt();
		codigo -= 1;
		
		int quantidade = leitor.nextInt();
		
		double total = quantidade * precos[codigo];
		
		System.out.printf("Total: R$ %.2f\n", total);
		
		leitor.close();
		
	}

}
