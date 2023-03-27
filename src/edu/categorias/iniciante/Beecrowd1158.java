package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1158 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x, y, soma = 0;
		
		 while (true) {
			 if (n == 0)
				 break;
			 
			 x = sc.nextInt();
			 y = sc.nextInt();
			 
			 if (x % 2 == 0)
				 x++;
			 
			 for (int i = 1 ; i <= y ; i++) {
				 soma += x;
				 x += 2;
			 }
			 
			 System.out.println(soma);
			 n--;
			 soma = 0;
		 }
		 
		
		sc.close();
	}

}
