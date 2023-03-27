package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1847 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int temp1 = sc.nextInt();
		int temp2 = sc.nextInt();
		int temp3 = sc.nextInt();
		
		if (temp1 > temp2 & temp3 >= temp2)	System.out.println(":)");
		else if (temp1 < temp2 & temp2 >= temp3) System.out.println(":(");
		else if (temp2 - temp1 > temp3 - temp2)	System.out.println(":(");
		else if (temp2 > temp1 & temp3 > temp2)	System.out.println(":)");
		else if (temp1 - temp2 > temp2 - temp3) System.out.println(":)");
		else if (temp1 - temp2 <= temp2 - temp3) System.out.println(":(");
		else if (temp1 == temp2 & temp2 < temp3) System.out.println(":)");
		else if (temp1 == temp2 & temp2 > temp3) System.out.println(":(");
		
		sc.close();
		
	}

}
