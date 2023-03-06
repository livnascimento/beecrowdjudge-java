package edu.categorias.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1534 {
	
	public static void main(String[] args) throws IOException {
		
        Scanner sc = new Scanner(System.in);
        
        int entrada;
        
        while (sc.hasNext()){
            
            entrada = sc.nextInt();
            
            imprimeMatriz(entrada);
            
        }
        
        sc.close();
    }
    
    static void imprimeMatriz(int entrada){
    	
    	
        int um = 0, dois = entrada - 1, insere;
        String linha = "";
        
        for (int i = 0 ; i < entrada ; i++){
            for (int j = 0 ; j < entrada ; j++){
                
            	insere = 3;
                
            	if (j == um) insere = 1;
            	if (j == um & j == dois) insere = 2;
                if (j == dois) insere = 2;
                
                linha+= insere;
                
                if (j == entrada - 1) linha += "\n";
            }
            System.out.print(linha);
            linha = "";
            um++;
            dois--;
        }
        
    }

}
