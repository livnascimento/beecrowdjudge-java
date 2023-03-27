package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1848 {
	
	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 String entrada = null;
		 int numero = 0;
		 
	        while (scanner.hasNext())
	        {
	            entrada = scanner.nextLine();
	            
	            if (entrada.equals("caw caw")) {
	            	System.out.println(numero);
	            	numero = 0;
	            } else {
	            	numero += calcula(entrada);
	            }
	            
	        }
	 		
		scanner.close();
		
	}
	
	static int calcula(String entrada) {

				switch (entrada) {
				case "--*": 
					return 1;
				case "-*-": 
					return 2;
				case "-**": 
					return 3;
				case "*--": 
					return 4;
				case "*-*":
					return 5;
				case "**-":
					return 6;
				case "***":
					return 7;
				default:
					return 8;			
		}
	}
}
