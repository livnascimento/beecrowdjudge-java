package edu.categorias.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1043 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float A = leitor.nextFloat();
		float B = leitor.nextFloat();
		float C = leitor.nextFloat();
		
		float [] lados = new float[3];
		
		lados[0] = A;
		lados[1] = B;
		lados[2] = C;
		
		Arrays.sort(lados);
		
		if (lados[0] + lados[1] > lados[2]) {
			float perimetro = lados[0] + lados[1] + lados[2];
			System.out.printf("Perimetro = %.1f\n", perimetro);
		} else {
			float area = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n", area);
		}
		
		leitor.close();
		
	}

}
