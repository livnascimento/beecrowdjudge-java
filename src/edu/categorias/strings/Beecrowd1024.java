package edu.categorias.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class Beecrowd1024 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		char replace;

		int n = Integer.parseInt(buffer.readLine());
		
		for (int i = 0 ; i < n ; i++) {
			
			str.delete(0, str.length());
			
			str.append(buffer.readLine());
			
			for (int j = 0 ; j < str.length() ; j ++) {
				if ((str.codePointAt(j) >= 65 & str.codePointAt(j) <= 90) | (str.codePointAt(j) >= 97 & str.codePointAt(j) <= 122)) {
					replace = (char) ((char) str.codePointAt(j) + 3);
					str.setCharAt(j, replace);
				}
			}

			
			str.reverse();

			for (int j = (int) Math.floor(str.length()/2) ; j < str.length() ; j ++) {
				replace = (char) ((char) str.codePointAt(j) - 1);
				str.setCharAt(j, replace);
			}
	
			System.out.println(str);
			
		}
		
	}

	
}
