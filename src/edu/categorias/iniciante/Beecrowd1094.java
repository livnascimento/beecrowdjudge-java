package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1094 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int coelhos = 0, ratos = 0, sapos = 0, total;
		
		for (int i = 1 ; i <= n ; i ++) {
			
			int quantia = sc.nextInt();
			String tipo = sc.next();
			
			switch (tipo) {
			case "C": {
				coelhos+=quantia;
				break;
			} case "R": {
				ratos+=quantia;
				break;
			}
			case "S": {
				sapos+=quantia;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + tipo);
			}
			
		}
		
		total = coelhos + ratos + sapos;
		
		double percentualCoelhos = (double) coelhos / (double) total * 100;
		double percentualRatos = (double) ratos / (double) total * 100;
		double percentualSapos = (double) sapos / (double) total * 100;
		
		System.out.printf("Total: %d cobaias\n", total);
		System.out.printf("Total de coelhos: %d\n", coelhos);
		System.out.printf("Total de ratos: %d\n", ratos);
		System.out.printf("Total de sapos: %d\n", sapos);
		System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);
		
		sc.close();
		
	}

}
