package br.com.guedes.iniciante;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double r = entrada.nextDouble();

		double esfera = (4.0 / 3) * 3.14159 * r * r * r;

		System.out.printf("VOLUME = %.3f\n", esfera);
		
		entrada.close();
	}
}