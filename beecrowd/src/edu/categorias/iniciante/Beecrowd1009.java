package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1009 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
        String vendedor = ler.nextLine();
        double salarioFixo = ler.nextDouble();
        double vendasEmDinheiro = ler.nextDouble();
        
        ler.close();
        
        double salarioFinal = salarioFixo + (vendasEmDinheiro * 15 / 100);

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);  
		
	}

}
