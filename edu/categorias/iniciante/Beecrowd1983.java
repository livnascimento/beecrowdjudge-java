package edu.categorias.iniciante;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Beecrowd1983 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<Double, Integer> notaAluno = new HashMap<Double, Integer>();
		
		int aluno;
		double nota, maiorNota = 0;
	
		int repeticoes = sc.nextInt();
		
		for (int i = 0 ; i < repeticoes ; i++) {
			aluno = sc.nextInt();
			nota = sc.nextDouble();
			
			notaAluno.put(nota, aluno);
			
			if (nota > maiorNota) maiorNota = nota;
				
		}
		
		
		if (maiorNota < 8 ) System.out.println("Minimum note not reached");
		else	System.out.println(notaAluno.get(maiorNota));
		
		sc.close();
	}

}
