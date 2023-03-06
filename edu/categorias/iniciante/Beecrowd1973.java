package edu.categorias.iniciante;

import java.util.HashSet;
import java.util.Scanner;

public class Beecrowd1973 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] qtdCarneiros = new int[n];
		HashSet<Integer> propriedadesVisitadas = new HashSet<Integer>();
		
		long carneirosRoubados, totalCarneiros = 0;
		
		for (int i = 0 ; i < n ; i++) {
			qtdCarneiros[i] = sc.nextInt();
			totalCarneiros += qtdCarneiros[i];
		}
		
		carneirosRoubados = calculaCarneirosRoubados(qtdCarneiros, propriedadesVisitadas);
		
		String carneirosRestantes = Long.toUnsignedString(totalCarneiros - carneirosRoubados);

		System.out.printf("%d %s\n", propriedadesVisitadas.size(), carneirosRestantes);
		
		sc.close();
		
	}
	
	static long calculaCarneirosRoubados(int[] qtdCarneiros, HashSet<Integer> propriedadesVisitadas) {
		
		int propriedade = 0, temp, carneirosRoubados = 0;
		
		while (true) {
			
			if (propriedade < 0 | propriedade >= qtdCarneiros.length)	break;
			
			temp = qtdCarneiros[propriedade];
			
			if (temp > 0) {
				qtdCarneiros[propriedade]--;
				carneirosRoubados++;
			}
			
			try {
				propriedadesVisitadas.add(propriedade);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			if (temp % 2 == 0)	propriedade--;
			else propriedade++;
			
		}
		
		return carneirosRoubados;
	}

}
