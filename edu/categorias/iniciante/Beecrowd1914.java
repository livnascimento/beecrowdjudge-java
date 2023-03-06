package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1914 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qt = sc.nextInt();
		String[] nomes= new String[2];
		String[] parImpar = new String[2];
		String resultado;
		int numero1, numero2, posicao = -1;
		
		for (int i = 0 ; i < qt ; i++) {
			nomes[0] = sc.next();
			parImpar[0] = sc.next();
			nomes[1] = sc.next();
			parImpar[1] = sc.next();
			
			numero1 = sc.nextInt();
			numero2 = sc.nextInt();
			
			if ((numero1 + numero2) % 2 == 0) resultado = "PAR";
			else resultado = "IMPAR";
			
			for (int j = 0; j < 2; j++) {
				if (parImpar[j].equals(resultado))
					posicao = j;
			}
			
			System.out.println(nomes[posicao]);
			
		}
		
		sc.close();
	}

}
