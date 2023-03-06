package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1589 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int raio1, raio2;
		
		for(int i = 1 ; i <= t ; i++) {
			raio1 = sc.nextInt();
			raio2 = sc.nextInt();
			
			System.out.println(raio1 + raio2);
		}
		
		sc.close();
		
	}

}
