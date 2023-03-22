package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2139 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] diasMes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int mes, dia;
		
		while(sc.hasNext()) {
			
			mes = sc.nextInt();
			dia = sc.nextInt();
			
			if (mes == 12 & dia > 25) System.out.println("Ja passou!");
			else if (mes == 12 & dia == 25) System.out.println("E natal!");
			else if (mes == 12 & dia == 24) System.out.println("E vespera de natal!");
			else calcularDias(diasMes, mes, dia);
		}
		
		sc.close();
		
	}
	
	static void calcularDias(int[] diasMes, int mes, int dia) {
		
		int totalDias = 0, natal = 360;
		
		for (int i = 0 ; i < mes - 1 ; i++) {
			totalDias += diasMes[i];
		}
		
		totalDias += dia;
		natal -= totalDias;
		
		System.out.printf("Faltam %d dias para o natal!\n", natal);
	}

}
