package br.com.guedes.iniciante;

import java.util.Scanner;

public class MediaDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();

		double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

		System.out.printf("MEDIA = %.1f\n", media);
		
		entrada.close();
	}
}