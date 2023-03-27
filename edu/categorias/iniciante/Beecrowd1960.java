package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1960 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		
		int numeroPaginas = sc.nextInt();
		
		int D, C, L, X, V, I;
		
		D = (int) numeroPaginas / 500;
		numeroPaginas -= D * 500;
		
		for (int i = 0 ; i < D ; i++)
			str.append("D");
		
		C = (int) numeroPaginas / 100;
		numeroPaginas -= C * 100;
		
		if (D == 1 & C == 4) {
			str.delete(0, str.length());
			str.append("CM");
		}
		else if (C == 4 ) str.append("CD");
		else
			for (int i = 0 ; i < C ; i++)
				str.append("C");
		
		L = (int) numeroPaginas / 50;
		numeroPaginas -= L * 50;
		
		for (int i = 0 ; i < L ; i++)
			str.append("L");
		
		X = (int) numeroPaginas / 10;
		numeroPaginas -= X * 10;
		
		if (L == 1 & X == 4) {
			str.delete(str.length() - 1, str.length());
			str.append("XC");
		}
		else if (X == 4) str.append("XL");
		else
			for (int i = 0 ; i < X ; i++)
				str.append("X");

		V = (int) numeroPaginas / 5;
		numeroPaginas -= V * 5;
		
		for (int i = 0 ; i < V ; i++)
			str.append("V");
		
		I = (int) numeroPaginas;		
		
		if (V == 1 & I == 4) {
			str.delete(str.length() - 1, str.length());
			str.append("IX");
		}
		else if (I == 4) str.append("IV");
		else
			for (int i = 0 ; i < I ; i++)
				str.append("I");
		
		System.out.println(str);
		
		sc.close();
		
	}

}
