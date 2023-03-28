package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1008 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
        int number = ler.nextInt();
        int hours = ler.nextInt();
        double hourPrice = ler.nextDouble();
        
        ler.close();
        
        double salary = hours * hourPrice;
        
        System.out.printf("NUMBER = " + number + "\nSALARY = U$ %.2f\n", salary);
		
	}
	
}
