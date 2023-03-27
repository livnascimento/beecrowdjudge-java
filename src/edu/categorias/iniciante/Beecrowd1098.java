package edu.categorias.iniciante;


public class Beecrowd1098 {
	
	public static void main(String[] args) {
		
		double i = 0, j = 1;
		
		while (i <= 1.8) {
			
			if ((int) i == 1 & Double.toString(i).endsWith("0"))
				j=2;
			
			if(Double.toString(i).endsWith("0")) {
				System.out.printf("I=%d J=%d\n", (int)i, (int)j);
				System.out.printf("I=%d J=%d\n", (int)i, (int)j+1);
				System.out.printf("I=%d J=%d\n", (int)i, (int)j+2);
				i += 0.2;
				j += 0.2;
			
			}
			
			System.out.printf("I=%.1f J=%.1f\n", i, j);
			System.out.printf("I=%.1f J=%.1f\n", i, j+1);
			System.out.printf("I=%.1f J=%.1f\n", i, j+2);
			i += 0.2;
			j += 0.2;
		}
		
		i += 0.2;
		j += 0.2;
		System.out.printf("I=%d J=%d\n", (int)i, (int)j);
		System.out.printf("I=%d J=%d\n", (int)i, (int)j+1);
		System.out.printf("I=%d J=%d\n", (int)i, (int)j+2);
		
	}

}
