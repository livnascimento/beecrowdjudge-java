package edu.categorias.iniciante;

public class Beecrowd1156 {
	
	public static void main(String[] args) {
		
		double S = 1.0, dividendo = 3.0, divisor = 2.0;
		
		
		while (dividendo <= 39) {
			S += (dividendo / divisor);
			dividendo += 2;
			divisor += divisor;			
		}
		
		System.out.printf("%.2f\n", S);
		
	}

}
