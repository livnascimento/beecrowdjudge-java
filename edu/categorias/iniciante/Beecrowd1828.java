package edu.categorias.iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1828 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String temp;
		int vencedor;
		ArrayList<String> escolhas = new ArrayList<String>();
		
		for (int i = 1 ; i <= t ; i ++) {
			
			escolhas.clear();
			
			temp = sc.next();
			escolhas.add(temp);
			temp = sc.next();
			escolhas.add(temp);
			
			vencedor = calculaVencedor(escolhas);
			
			System.out.printf("Caso #%d: ", i);
			
			switch (vencedor) {
			case 0: {
				System.out.println("Bazinga!");
				break;
			}
			case 1: {
				System.out.println("Raj trapaceou!");
				break;
			}			
			default:
				System.out.println("De novo!");
			}
			
		}
		
		sc.close();
	}
	
	static int calculaVencedor(ArrayList<String> escolhas) {
	
		if (escolhas.get(0).equals("tesoura")) {
			
			switch (escolhas.get(1)) {
			case "papel":
				return 0;
			case "lagarto":
				return 0;
			case "Spock":
				return 1;
			case "pedra":
				return 1;
			}
			
		} else if (escolhas.get(0).equals("pedra")) {
			
			switch (escolhas.get(1)) {
			case "tesoura":
				return 0;
			case "lagarto":
				return 0;
			case "Spock":
				return 1;
			case "papel":
				return 1;
			}
			
		} else if (escolhas.get(0).equals("papel")) {
			
			switch (escolhas.get(1)) {
			case "Spock":
				return 0;
			case "pedra":
				return 0;
			case "tesoura":
				return 1;
			case "lagarto":
				return 1;
			}
			
		} else if (escolhas.get(0).equals("lagarto")) {
			
			switch (escolhas.get(1)) {
			case "Spock":
				return 0;
			case "papel":
				return 0;
			case "tesoura":
				return 1;
			case "pedra":
				return 1;
			}
			
		} else if (escolhas.get(0).equals("Spock")) {
			
			switch (escolhas.get(1)) {
			case "pedra":
				return 0;
			case "tesoura":
				return 0;
			case "papel":
				return 1;
			case "lagarto":
				return 1;
			}
			
		}
		
		return -1;
	}
	
}
