package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1837 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int quociente, resto;
		
		quociente = (int) a / b;
		resto = a % b;	
		
		if (resto < 0) {
			resto += b;
			resto = Math.abs(resto);
			quociente = (a - resto) / b;
		}
		
		if (resto > Math.abs(b)) {
			resto = b + (resto + b);
			resto = Math.abs(resto);
			quociente = (a - resto) / b;
		}
		
		if (a == b * quociente + resto)
			System.out.printf("%d %d\n", quociente, resto);
		
		sc.close();
	}

}
