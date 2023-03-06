package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1046 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int horaInicial = leitor.nextInt();
		int horaFinal = leitor.nextInt();
		int duracao;
		
		if (horaInicial == horaFinal)
			duracao = 24;
		else if (horaInicial > horaFinal)
			duracao = (24 - horaInicial) + horaFinal;
		else 
			duracao = horaFinal - horaInicial;
		
		System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		
		leitor.close();
		
	}
	
}
