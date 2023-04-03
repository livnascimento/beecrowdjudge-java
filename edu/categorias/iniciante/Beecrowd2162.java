package edu.categorias.iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd2162 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] picosVales = new int[n];

		for (int i = 0; i < n; i++)
			picosVales[i] = sc.nextInt();

		boolean padrao = conferePadrao(picosVales);

		if (padrao == true)
			System.out.println(1);
		else
			System.out.println(0);

		sc.close();

	}

	static boolean conferePadrao(int[] picosVales) {
		
		ArrayList<String> baixoAlto = new ArrayList<String>();
		
		for (int i = 0 ; i < picosVales.length ; i++ ) {
			
			if (i < picosVales.length - 1) {
				if (picosVales[i] < picosVales[i + 1]) baixoAlto.add("menor");
				else baixoAlto.add("maior");
			} else {
				if (picosVales[i] > picosVales[i - 1]) baixoAlto.add("maior");
				else baixoAlto.add("menor");
			}
			
		}
		
		for (int i = 0; i < baixoAlto.size() ; i++) {
			if (i < baixoAlto.size() - 1) {
				if (baixoAlto.get(i).equals(baixoAlto.get(i + 1))) return false;
			}
		}
		
		return true;
	}

}
