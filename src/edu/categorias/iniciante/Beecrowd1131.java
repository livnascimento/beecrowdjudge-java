package edu.categorias.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1131 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		int golsInter = 0, golsGremio = 0, empates = 0, grenais = 0, vitoriasInter = 0, vitoriasGremio = 0;
		boolean novoGrenal;
		
		while (true) {
			
			golsInter = sc.nextInt();
			golsGremio = sc.nextInt();
			
			if ( golsInter == golsGremio)
				empates++;
			else if (golsInter > golsGremio) 
				vitoriasInter++;
			else if (golsGremio > golsInter)
				vitoriasGremio++;
			
			grenais++;
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = reinicia();
			
			if (novoGrenal == true)
				continue;
			else if(novoGrenal == false)
				break;
		}
		
		System.out.printf("%d grenais\n", grenais);
		System.out.printf("Inter:%d\n", vitoriasInter);
		System.out.printf("Gremio:%d\n", vitoriasGremio);
		System.out.printf("Empates:%d\n", empates);
		
		String vencedor = vitoriasInter > vitoriasGremio ? "Inter" : "Gremio";
		
		System.out.println(vencedor + " venceu mais");
		
	}
	
	public static boolean reinicia() {
		
		int opcao;
		
		while (true) {
			opcao = sc.nextInt();
			
			if (opcao < 1 | opcao > 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				continue;
			}
			
			break;
		}
		
		if (opcao == 1)
			return true;
		else if (opcao == 2)
			return false;
		
		return false;
	}

}
