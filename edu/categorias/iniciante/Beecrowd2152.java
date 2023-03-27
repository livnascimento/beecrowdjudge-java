package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd2152 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String hora, minuto, abreFecha;
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			
			hora = sc.next();
			minuto = sc.next();
			abreFecha = sc.next();
			
			hora = (hora.length() < 2) ? "0".concat(hora) : hora;
			minuto = (minuto.length() < 2) ? "0".concat(minuto) : minuto;

			System.out.printf("%s:%s - ", hora, minuto);
			
			if (abreFecha.equals("1")) System.out.println("A porta abriu!");
			else System.out.println("A porta fechou!");
			
		}
		
		sc.close();
		
	}

}
