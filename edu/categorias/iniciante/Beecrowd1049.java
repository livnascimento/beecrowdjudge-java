package edu.categorias.iniciante;

import java.util.Scanner;

public class Beecrowd1049 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String ossada = leitor.next();
		String classe = leitor.next();
		String alimentacao = leitor.next();
		String animal;
		
		if (ossada.equals("vertebrado")) {
			if (classe.equals("ave"))
				animal = alimentacao.equals("carnivoro") ? "aguia" : "pomba";
			else
				animal = alimentacao.equals("onivoro") ? "homem" : "vaca";
		} else {
			if (classe.equals("inseto"))
				animal = alimentacao.equals("hematofago") ? "pulga" : "lagarta";
			else
				animal = alimentacao.equals("hematofago") ? "sanguessuga" : "minhoca";
		}
		
		System.out.println(animal);
		
		leitor.close();
		
	}
	
}
