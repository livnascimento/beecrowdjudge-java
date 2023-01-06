package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1041 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float x = leitor.nextFloat();
		float y = leitor.nextFloat();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo Y");
		} else if (y == 0) {
			System.out.println("Eixo X");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		
		leitor.close();
		
	}
	
}
