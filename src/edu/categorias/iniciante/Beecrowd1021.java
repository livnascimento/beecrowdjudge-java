package edu.categorias.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1021 {

	public static void main(String[] args) throws IOException {
		 
		        Scanner leitor = new Scanner(System.in); 
		        
		        double valor = leitor.nextDouble();
		        
		        int nota100 = (int) (valor / 100);
		        valor %= 100;
		        int nota50 = (int) (valor / 50);
		        valor %= 50;
		        int nota20 = (int) (valor / 20);
		        valor %= 20;
		        int nota10 = (int) (valor / 10);
		        valor %= 10;
		        int nota5 = (int) (valor / 5);
		        valor %= 5;
		        int nota2 = (int) (valor / 2);
		        
		        valor = (valor % 2) * 100;
		        
		        int moeda100 = (int) (valor / 100);
		        valor %= 100;
		        int moeda50 = (int) (valor / 50);
		        valor %= 50;
		        int moeda25 = (int) (valor / 25);
		        valor %= 25;
		        int moeda10 = (int) valor / 10;
		        valor %= 10;
		        int moeda5 = (int) valor / 5;
		        valor %= 5;
		        int moeda1 = (int) valor;
		        
		        System.out.printf("NOTAS:\n" +
								  "%d nota(s) de R$ 100.00\n" +
								  "%d nota(s) de R$ 50.00\n" +
								  "%d nota(s) de R$ 20.00\n" +
								  "%d nota(s) de R$ 10.00\n" +
								  "%d nota(s) de R$ 5.00\n" +
							      "%d nota(s) de R$ 2.00\n" +
								  "MOEDAS:\n" +
								  "%d moeda(s) de R$ 1.00\n" +
								  "%d moeda(s) de R$ 0.50\n" +
								  "%d moeda(s) de R$ 0.25\n" +
								  "%d moeda(s) de R$ 0.10\n" +
								  "%d moeda(s) de R$ 0.05\n" +
								  "%d moeda(s) de R$ 0.01\n", nota100, nota50, nota20, nota10, nota5, nota2, moeda100, moeda50, moeda25, moeda10, moeda5, moeda1);
		        
		        leitor.close();
		        
		        
		  }

}
