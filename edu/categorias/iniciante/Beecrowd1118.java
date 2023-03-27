package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1118 {
	
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		double nota1 = 0, nota2 = 0, media;
		int opcao = 0;
		
		while(true) {
			
			nota1 = validaNota(nota1);
			nota2 = validaNota(nota2);
			
			media = (nota1 + nota2) / 2;
			
			System.out.printf("media = %.2f\n", media);
			
			System.out.println("novo calculo (1-sim 2-nao)");
			
			opcao = validaOpcao(opcao);
			
			if (opcao == 2)
				break;
			
		}
		
		
	}
	
	public static double validaNota (double nota) {
		
		while (true) {
			nota = sc.nextDouble();
			
			if (nota < 0 | nota > 10) {
				System.out.println("nota invalida");
				continue;
			} 
			
			break;
		}
			
		return nota;
	}
	
	public static int validaOpcao( int opcao) {
		
		while(true) {
			
			opcao = sc.nextInt();
			
			if (opcao < 1 | opcao > 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				continue;
			}
			

			break;
			
		}
			
		return opcao;
		
	}
	
}
