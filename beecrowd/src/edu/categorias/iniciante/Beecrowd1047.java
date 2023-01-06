package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1047 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int horaInicial = leitor.nextInt();
		int minutoInicial = leitor.nextInt();
		int horaFinal = leitor.nextInt();
		int minutoFinal = leitor.nextInt();
		int horas = 0, minutos = 0;	
		
		if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
			horas = 24;
			minutos = 0;
		} else if (horaInicial > horaFinal) {
			
			horas = ((24 - horaInicial) + horaFinal);
			
			if (minutoInicial > minutoFinal) {				
				minutos = (60 -  minutoInicial) + minutoFinal;
				horas--;
			}
			 else 
				 minutos = minutoFinal - minutoInicial;
			 
		} else if (horaFinal > horaInicial) {
						
			if (minutoInicial > minutoFinal) { 
				minutos = (60 -  minutoInicial) + minutoFinal;
				horas = horaFinal - horaInicial - 1;
			} else {				
				minutos = minutoFinal - minutoInicial;
				horas = horaFinal - horaInicial;
			}
		} else if (horaFinal == horaInicial) {
			if (minutoInicial > minutoFinal) {				
				minutos = (60 -  minutoInicial) + minutoFinal;
				horas = 23;
			}
			 else 
				 minutos = minutoFinal - minutoInicial;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
		
		leitor.close();
		
	}
	
}
