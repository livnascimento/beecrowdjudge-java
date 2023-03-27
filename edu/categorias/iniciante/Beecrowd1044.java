package edu.categorias.iniciante;

import java.util.Scanner;
import java.util.Arrays;

public class Beecrowd1044 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		
		int [] numeros = new int[2];
		
		numeros[0] = A;
		numeros[1] = B;
		
		Arrays.sort(numeros);
		
		String multiplos = numeros[1] % numeros[0] == 0 ? "Sao Multiplos" : "Nao sao Multiplos";
		
		System.out.println(multiplos);
		
		leitor.close();
		
	}

}
