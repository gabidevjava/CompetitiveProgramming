package br.com.guedes.iniciante;

import java.util.Scanner;

public class MediaUm {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double a = entrada.nextDouble();
		double b = entrada.nextDouble();

		double media = ((a * 3.5) + (b * 7.5)) / 11;

		System.out.printf("MEDIA = %.5f\n", media);
		
		entrada.close();
	}
}