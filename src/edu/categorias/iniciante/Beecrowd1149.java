package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1149 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int A = sc.nextInt();
		int N = validaN();
		int soma = 0;
		
		for (int i = 0 ; i <= (N -1) ; i ++ )
			soma += (A + i);
		
		System.out.println(soma);
		
		sc.close();
		
	}
	
	public static int validaN(){
		
		int n;
		while (true) {
			n = sc.nextInt();
			
			if (n > 0)
				return n;
			else
				continue;
		}
	}

}
