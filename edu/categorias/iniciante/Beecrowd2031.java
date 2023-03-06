package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2031 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);;
		
		String jogador1, jogador2, vencedor;
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			jogador1 = sc.next();
			jogador2 = sc.next();
			
			vencedor = calculaVencedor(jogador1, jogador2);
			
			System.out.println(vencedor);
		}
		
		sc.close();
		
	}
	
	static String calculaVencedor(String jogador1, String jogador2) {
		
		String vencedor = "";
		
		if (jogador1.equals("ataque")) {
			if (jogador2.equals("pedra"))	vencedor = "Jogador 1 venceu";
			else if (jogador2.equals("papel")) vencedor = "Jogador 1 venceu";
			else if (jogador2.equals("ataque")) vencedor = "Aniquilacao mutua";
		} else if (jogador1.equals("papel")) {
			if (jogador2.equals("papel")) vencedor = "Ambos venceram";
			else if (jogador2.equals("ataque")) vencedor = "Jogador 2 venceu";
			else if (jogador2.equals("pedra")) vencedor = "Jogador 2 venceu";
		} else if (jogador1.equals("pedra")) {
			if (jogador2.equals("pedra")) vencedor = "Sem ganhador";
			else if (jogador2.equals("papel")) vencedor = "Jogador 1 venceu";
			else if (jogador2.equals("ataque")) vencedor = "Jogador 2 venceu";
		}
		
		return vencedor;
	}

}
