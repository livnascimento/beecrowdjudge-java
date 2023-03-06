package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2059 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] escolhas = new String[2];
		String imparPar;
		int vencedor = 0;
		
		int p = sc.nextInt();
		
		if(p == 1) {
			escolhas[0] = "par";
			escolhas[1] = "impar";
		} else {
			escolhas[0] = "impar";
			escolhas[1] = "par";
		}
		
		int j1 = sc.nextInt();
		int j2 = sc.nextInt();
		
		int r = sc.nextInt();
		int a = sc.nextInt();
		
		if ((j1 + j2) % 2 == 0) imparPar = "par";
		else imparPar = "impar";
		
		for (int i = 0 ; i < 2 ; i++) 
			if (escolhas[i].equals(imparPar))	vencedor = i + 1;
		
		if (r == 1 & a == 0) vencedor = 1;
		else if (r == 1 & a == 1) vencedor = 2;
		
		System.out.printf("Jogador %d ganha!\n", vencedor);
		
		
		sc.close();
		
	}

}
