package iniciante;

import java.util.Scanner;

public class Media1040 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double N1 =  leitor.nextDouble();
		double N2 =  leitor.nextDouble();
		double N3 =  leitor.nextDouble();
		double N4 =  leitor.nextDouble();
		
		double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
		
		System.out.printf("Media: %.1f\n", media);
		
		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media >= 5 && media <= 6.9)  {
			System.out.println("Aluno em exame.");
			
			double N5 = leitor.nextDouble();
			
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
