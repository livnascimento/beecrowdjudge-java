package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1144 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = 1;
		
		for (int i = 1 ; i <= n ; i ++) {
			
			System.out.printf("%d %d %d\n", temp, temp * temp, temp * temp * temp);
			System.out.printf("%d %d %d\n", temp, (temp * temp) + 1, (temp * temp * temp) + 1);
			temp++;
			
		}
		
		sc.close();
		
	}

}
