package iniciante;

import java.util.Scanner;

public class MediaSimples1005 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double A = ler.nextDouble();
		double B = ler.nextDouble();

		ler.close();

		double MEDIA = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);

		System.out.printf("MEDIA = %.5f\n", MEDIA);
	
	}
	
}
