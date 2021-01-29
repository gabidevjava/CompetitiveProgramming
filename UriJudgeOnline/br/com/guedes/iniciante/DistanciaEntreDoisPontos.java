package br.com.guedes.iniciante;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double eixoA = entrada.nextDouble();
		double eixoB = entrada.nextDouble();
		double eixoC = entrada.nextDouble();
		double eixoD = entrada.nextDouble();

		double distancia = Math.sqrt((eixoC - eixoA) * (eixoC - eixoA) + (eixoD - eixoB) * (eixoD - eixoB));

		System.out.printf("%.4f\n", distancia);
		
		entrada.close();
	}
}