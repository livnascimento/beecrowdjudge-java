package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1864 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] phrase = {"L","I","F","E"," ","I","S"," ","N","O","T"," ","A"," ","P","R","O","B","L","E","M"," ","T","O"," ","B","E"," ","S","O","L","V","E","D"};
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n ; i++)
			sb.append(phrase[i]);
		
		System.out.println(sb);
		
		sc.close();
		
	}

}
