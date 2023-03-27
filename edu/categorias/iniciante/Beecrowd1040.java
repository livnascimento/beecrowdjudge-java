package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1040 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float N1 =  leitor.nextFloat();
		float N2 =  leitor.nextFloat();
		float N3 =  leitor.nextFloat();
		float N4 =  leitor.nextFloat();
		
		float media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
		
		System.out.printf("Media: %.1f\n", media);
		
		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media >= 5 && media <= 6.9)  {
			System.out.println("Aluno em exame.");
			
			float N5 = leitor.nextFloat();
			
			System.out.printf("Nota do exame: %.1f\n", N5);
			
			media = (N5 + media) / 2;
			
			String resultado = media >= 5 ? "Aluno aprovado." : "Aluno reprovado.";
			
			System.out.println(resultado);
			System.out.printf("Media final: %.1f\n", media);
			
		} else if (media < 5) {
			System.out.println("Aluno reprovado.");
		}
		
		leitor.close();
		
	}
}
