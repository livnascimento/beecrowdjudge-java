package edu.categorias.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.LinkedList;

public class Beecrowd1120 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		int numero;
		StringBuilder str = new StringBuilder();
		
		while (true) {
			
			str.delete(0, str.length());
			
			str.append(buffer.readLine());

			String obj = "0 0";
			if (str.equals(obj))	break;

			numero = Integer.valueOf(str.substring(0, 1));
			str.delete(0, 2);
			
			
			
			
			System.out.println(numero);
			System.out.println(str);
			
			
		}		
		
	}

}
