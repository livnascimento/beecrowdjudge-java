package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1929 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean resultado = false;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (a + b > c & b + c > a & a + c > b) resultado = true;
		if (b + c > d & b + d > c & d + c > b) resultado = true;
		if (c + d > a & a + d > c & a + c > d) resultado = true;
		if (a + b > d & b + d > a & a + d > b) resultado = true;
		
		if (!resultado) System.out.println("N");
		else System.out.println("S");
		
		sc.close();
		
	}

}
