package edu.categorias.matematica;

import java.util.Scanner;

public class Beecrowd1028 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			
			int figs1 = sc.nextInt();
			int figs2 = sc.nextInt();
			int resto;
					
			resto = figs1 % figs2;
			
			while (resto != 0){
				figs1 = figs2;
				figs2 = resto;
				resto = figs1 % figs2;			
				
			};
			
			System.out.println(figs2);
			
		}
		
		sc.close();
		
	}

}
