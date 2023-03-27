package edu.categorias.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1045 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		
		double [] lados = {A, B, C};
		
		Arrays.sort(lados);
		
		//o seguinte código bubble sort compara os valores do array, sempre de dois em dois, e quando o valor posterior
		// é maior, ele inverte a posição de ambos, deixando o vetor em ordem decrescente
		
		for (int i = 1; i < lados.length; i++) { 
		    for (int j = 0; j < i; j++) {
		        if (lados[i] > lados[j]) {
		            double temp = lados[i];
		            lados[i] = lados[j];
		            lados[j] = temp;
		        }
		    }
		}
		
		A = lados[0];
		B = lados[1];
		C = lados[2];
		
		if (A >= B + C)
			System.out.println("NAO FORMA TRIANGULO");
		else {
			if (A * A == B * B + C * C) 
				System.out.println("TRIANGULO RETANGULO");
			if (A * A > B * B + C * C) 
				System.out.println("TRIANGULO OBTUSANGULO");
			if (A * A < B * B + C * C)
				System.out.println("TRIANGULO ACUTANGULO");
			if (A == B && B == C)
				System.out.println("TRIANGULO EQUILATERO");
			if (A == B & A != C || B == C && B != A || C == A && C!= B)
				System.out.println("TRIANGULO ISOSCELES");
		}
		
		leitor.close();
		
	}

}
