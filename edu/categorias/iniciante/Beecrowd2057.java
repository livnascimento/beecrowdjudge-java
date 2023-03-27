package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2057 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int saida = sc.nextInt();
		int tempoViagem = sc.nextInt();
		int fuso = sc.nextInt();
		
		int horarioChegada = saida + tempoViagem + fuso;
		
		if (horarioChegada >= 24) horarioChegada -= 24;
		else if (horarioChegada < 0) horarioChegada += 24;

		System.out.println(horarioChegada);
		
		sc.close();
		
	}

}
