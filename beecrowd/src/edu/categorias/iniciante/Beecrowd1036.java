package edu.categorias.iniciante;


import java.util.Scanner;

public class Beecrowd1036 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		
		double delta = (B*B)-(4*A*C);
		double r1 = (-B + Math.sqrt(delta)) / (2*A);
		double r2 = (-B - Math.sqrt(delta)) / (2*A);
		
		if (A == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
		}
		
		leitor.close();
		
	}
	
}
