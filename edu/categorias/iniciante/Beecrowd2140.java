package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2140 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int compra, pagamento, troco, nota1 = 0;
		int[] notas = {2, 5, 10, 20, 50, 100};
		boolean possible;
		
		while (true) {
			
			possible = false;
			
			compra = sc.nextInt();
			pagamento = sc.nextInt();
			
			if (compra == 0 & pagamento == 0) break;
			
			troco = pagamento - compra;
			
			for (int i = 5; i >= 0 ; i--) {
				if (notas[i] < troco) {
					nota1 = notas[i];
					break;
				}
			}
			
			troco -= nota1;
			
			for (int i : notas) {
				if (i == troco) possible = true;
			}
			
			
			if (possible == true) System.out.println("possible");
			else System.out.println("impossible");
			
		}
		
		sc.close();
		
	}

}
