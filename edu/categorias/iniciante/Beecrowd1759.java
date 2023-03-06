package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1759 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		StringBuilder str = new StringBuilder();
		
		for(int i = 1 ; i <= n ; i++) {
			str.append("Ho");
			if (i == n ) str.append("!");
			else str.append(" ");
		}
		
		System.out.println(str);
		sc.close();
		
	}

}
