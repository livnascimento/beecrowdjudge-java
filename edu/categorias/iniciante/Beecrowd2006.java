package edu.categorias.iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd2006 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> respostas = new ArrayList<>();
		int counter = 0;
		
		int t = sc.nextInt();
		
		for (int i = 0 ; i < 5 ; i++)
			respostas.add(sc.nextInt());

		for (Integer integer : respostas) 
			if (integer.equals(t))
				counter++;
		
		System.out.println(counter);
		
		sc.close();
		
	}

}
