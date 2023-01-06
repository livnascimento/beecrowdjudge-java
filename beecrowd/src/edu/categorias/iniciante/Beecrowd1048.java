package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1048 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double salario = leitor.nextDouble();
		double novoSalario = 0, reajuste = 0;
		int percentual = 0;
		
		if (salario > 0 & salario <= 400) {
			novoSalario = salario + (salario * 15/100);
			reajuste = novoSalario - salario;
			percentual = 15;
		} else if (salario > 400 & salario <= 800) {
			novoSalario = salario + (salario * 12/100);
			reajuste = novoSalario - salario;
			percentual = 12;
		} else if (salario > 800 & salario <= 1200) {
			novoSalario = salario + (salario * 10/100);
			reajuste = novoSalario - salario;
			percentual = 10;
		} else if (salario > 1200 & salario <= 2000) {
			novoSalario = salario + (salario * 7/100);
			reajuste = novoSalario - salario;
			percentual = 7;
		} else if (salario > 2000) {
			novoSalario = salario + (salario * 4/100);
			reajuste = novoSalario - salario;
			percentual = 4;
		}
		
		System.out.printf("Novo salario: %.2f\n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.println("Em percentual: " + percentual + " %");
			
		leitor.close();
	}
	
}
