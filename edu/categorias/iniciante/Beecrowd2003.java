package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2003 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder();
		int horas, minutos, totalMinutos, atraso;
		
		while (sc.hasNext()) {
			
			str.delete(0, str.length());
			str.append(sc.nextLine());

			horas = Integer.parseInt(str.substring(0, 1));
			minutos = Integer.parseInt(str.substring(2, 4));
			
			totalMinutos = horas * 60 + minutos;
			
			atraso = 480 - totalMinutos;
			
			if (atraso < 60) atraso = 60 - atraso;
			else atraso = 0;
			
			System.out.printf("Atraso maximo: %d\n", atraso);

		}
		
		
		sc.close();
		
	}

}
