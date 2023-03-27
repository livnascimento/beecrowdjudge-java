package edu.categorias.adhoc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Beecrowd1030 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int NC = 1;
		
		while (NC <= 30) {
			
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int chaveRemover, temp;
			
			Map<Integer, Integer> soldados = new HashMap<>();
		
			for (int i = 0 ; i < n ; i++) {
				soldados.put(i, i+1);
			}
			
			chaveRemover = k - 1;
			
			while (soldados.size() > 1) {
				
				System.out.println("chave: " + chaveRemover);
				
				if (soldados.containsKey(chaveRemover)) {

					soldados.remove(chaveRemover);
					System.out.println("no if, removi a chave: " + chaveRemover);
					
					chaveRemover += k;
					
				} else {
					
					chaveRemover -= k;

					Set<Integer> set = soldados.keySet();
					Integer[] arrayChaves = new Integer[set.size()];
					set.toArray(arrayChaves);
					
					int[] chavesRestantes = new int[set.size()];
					
					for (int i = 0 ; i < arrayChaves.length ; i++) {
						chavesRestantes[i] = arrayChaves[i];
					}
					
					System.out.println(Arrays.toString(chavesRestantes));
					
					if (soldados.size() > chaveRemover){						
						temp = (k - (soldados.size() - chaveRemover));
					} else {
						temp = (k - (chaveRemover - soldados.size()));
					}
					
					System.out.println("temp: " + temp);
					
					chaveRemover = 0;
					
					for (int i = 0 ; i <= temp; i++) {
						chaveRemover = chavesRestantes[i];
						System.out.println("chave no for: " + chavesRestantes[i]);
					}
					
					
					soldados.remove(chaveRemover);
					System.out.println("no else, removi a chave: " + chaveRemover);

					if(soldados.containsKey(chaveRemover += k)){
						chaveRemover += 0;						
					}
					else {
						chaveRemover += 1;
					}
				}
				
			}
			
			
			System.out.printf("Case %d: ", NC);
			System.out.println(soldados.values());
			
			NC++;
			
		}
		
		sc.close();
		
	}

}
