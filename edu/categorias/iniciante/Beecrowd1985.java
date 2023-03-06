package edu.categorias.iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Beecrowd1985 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Double> cardapio = new HashMap<Integer, Double>();
		
		cardapio.put(1001, 1.50);
		cardapio.put(1002, 2.50);
		cardapio.put(1003, 3.50);
		cardapio.put(1004, 4.50);
		cardapio.put(1005, 5.50);
		
		int qtdProdutos = sc.nextInt();
		int produto, qtd;
		double total = 0;
		
		for (int i = 0 ; i < qtdProdutos ; i++) {
			produto = sc.nextInt();
			qtd = sc.nextInt();
			
			total += cardapio.get(produto) * qtd;
		}
		
		System.out.printf("%.2f\n", total);
		
		sc.close();
	}

}
