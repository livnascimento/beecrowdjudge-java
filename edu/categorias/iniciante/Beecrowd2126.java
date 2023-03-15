package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2126 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder str1 = new StringBuilder(), str2 = new StringBuilder();
		int contador = 1;
		
		while (sc.hasNext()) {
			
			str1.delete(0, str1.length());
			str2.delete(0, str2.length());
			
			str1.append(sc.next());
			str2.append(sc.next());

			System.out.printf("Caso #%d:\n", contador);
			if (str2.indexOf(str1.toString()) == -1)	System.out.println("Nao existe subsequencia");
			else calcularSubsequencias(str1, str2);
			System.out.println();
			
			contador++;
			
		}

		sc.close();
		
	}
	
	static void calcularSubsequencias(StringBuilder str1, StringBuilder str2) {
		
		int subsequencias = 0;
		int index, ultimoIndex = str2.lastIndexOf(str1.toString()) + 1;
		
		while (str2.indexOf(str1.toString()) != -1) {
			index = str2.indexOf(str1.toString());
			subsequencias++;
			str2.delete(index, index + str1.length());
		}
		
		System.out.printf("Qtd.Subsequencias: %d\n", subsequencias);
		System.out.printf("Pos: %d\n", ultimoIndex);
		
	}

}
