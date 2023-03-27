package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1061 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String auxiliar = sc.next();
		int dataInicial = sc.nextInt();
		int horaInicial = sc.nextInt();
		auxiliar = sc.next();
		int minutoInicial = sc.nextInt();
		auxiliar = sc.next();
		int segundoInicial = sc.nextInt();
		int dias, horas, minutos, segundos;
		
		int tempoInicio = ((horaInicial*3600)+(minutoInicial*60)+segundoInicial)+((dataInicial-1)*24*3600);
		
		auxiliar = sc.next();
		int dataFinal = sc.nextInt();
		int horaFinal = sc.nextInt();
		auxiliar = sc.next();
		int minutoFinal = sc.nextInt();
		auxiliar = sc.next();
		int segundoFinal = sc.nextInt();
		
		int tempoFinal = ((horaFinal*3600)+(minutoFinal*60)+segundoFinal)+((dataFinal-1)*24*3600);
		
		int tempoTotal = tempoFinal - tempoInicio;
		
		dias = tempoTotal/86400;
		tempoTotal -= dias*86400;
		horas = tempoTotal/3600;
		tempoTotal -= horas*3600;
		minutos = tempoTotal/60;
		tempoTotal -= minutos*60;
		segundos = tempoTotal;
		
		System.out.printf("%d dia(s)\n", dias);
		System.out.printf("%d hora(s)\n", horas); 
		System.out.printf("%d minuto(s)\n", minutos);
		System.out.printf("%d segundo(s)\n", segundos);
		
		sc.close();
	}

}
