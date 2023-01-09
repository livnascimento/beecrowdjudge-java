package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1051 {
	
	private static Object imposto;

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double salario = leitor.nextDouble();
		
		if (salario > 0 & salario <= 2000)
			imposto = "Isento";
		else if (salario > 2000 & salario <= 3000)
			imposto = (salario - 2000) * 0.08;
		else if (salario > 3000 & salario <= 4500)
			imposto = (salario - 2000 - (salario - 3000)) * 0.08 + (salario - 3000) * 0.18;
		else
			imposto = 1000 * 0.08 + 1500 * 0.18 + (salario - 4500) * 0.28;
		
		if (imposto == "Isento") 
			System.out.println(imposto);
		else
			System.out.printf("R$ %.2f\n", imposto);
		
		leitor.close();
		
	}
	
}
