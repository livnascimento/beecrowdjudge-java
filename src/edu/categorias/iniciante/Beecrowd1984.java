package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1984 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		StringBuilder str = new StringBuilder();
		
		str.append(Long.toString(n));
		str.reverse();
		
		System.out.println(str);
		
		sc.close();
		
	}

}
