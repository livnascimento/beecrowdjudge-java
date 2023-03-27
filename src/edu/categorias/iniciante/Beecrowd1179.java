package edu.categorias.iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1179 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> impares = new ArrayList<Integer>();	
		int temp;
		
		for (int i = 1 ; i <= 15 ; i++) {
			
			if (pares.size() == 5) {
				for (int j = 0 ; j < 5 ; j++)
					System.out.printf("par[%d] = %d\n", j, pares.get(j));
				pares.removeAll(pares);
			}
				
			if (impares.size() == 5) {
				for (int j = 0 ; j < 5 ; j++)
					System.out.printf("impar[%d] = %d\n", j, impares.get(j));
				impares.removeAll(impares);
			}
				
			temp = sc.nextInt();
			
			if (temp % 2 == 0)
				pares.add(temp);
			else if (temp % 2 != 0)
				impares.add(temp);
			
		}
		
		for (int i = 0 ; i < impares.size() ; i ++)
			System.out.printf("impar[%d] = %d\n", i, impares.get(i));
		
		for (int i = 0 ; i < pares.size() ; i ++)
			System.out.printf("par[%d] = %d\n", i, pares.get(i));
		
		sc.close();
	}

}
