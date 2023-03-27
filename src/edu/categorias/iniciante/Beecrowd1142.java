package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1142 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = 1;
		
		for (int i = 1 ; i <= n ; i ++) {
			System.out.printf("%d %d %d PUM\n", temp, temp + 1, temp + 2);
			temp += 4;
		}
		
		sc.close();
		
	}

}
