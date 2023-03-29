package edu.categorias.iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Beecrowd2160 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		String entrada = buffer.readLine();
		
		if (entrada.length() > 80) System.out.println("NO");
		else System.out.println("YES");
	
	}

}
