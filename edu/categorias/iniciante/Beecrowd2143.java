package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2143 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t, n, totalPedidos;
		
		while(true) {
			
			
			t = sc.nextInt();
			
			if (t == 0) break;
			
			for (int i = 0 ; i < t ; i++) {
				
				n = sc.nextInt();
				
				totalPedidos = 0;
				
				if (n % 2 != 0) {
					n--;
					totalPedidos++;
				} else {
					n -= 2;
					totalPedidos += 2;
				}
				
				totalPedidos += n * 2;
				
				System.out.println(totalPedidos);
				
			}
			
		}
		
		sc.close();
		
	}

}
