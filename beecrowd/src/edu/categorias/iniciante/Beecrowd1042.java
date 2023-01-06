package edu.categorias.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1042 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		
		int [] numeros = new int[3];
		
		numeros[0] = a;
		numeros[1] = b;
		numeros[2] = c;
		
		Arrays.sort(numeros);
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.printf("\n%d\n%d\n%d\n", a, b, c);
		
		leitor.close();
		
	}
	
}
