package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1134 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		int alcool = 0, diesel = 0, gasolina = 0, entrada = 0;
		
		while (entrada != 4) {
			entrada = validaEntrada();
			
			switch (entrada) {
				case 1: {
					alcool++;
					break;
				}
				case 2: {
					gasolina++;
					break;
				}
				case 3: {
					diesel++;
					break;
				}
			}
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
	}
	
	public static int validaEntrada() {
		
		int entrada;
		
		while (true) {
			
			entrada = sc.nextInt();
			
			if (entrada < 1 | entrada > 4)
				continue;
			else
				break;
			
		}
		
		return entrada;
		
	}

}
