package br.com.guedes.iniciante;

import java.util.Scanner;

public class GastoDeCombustivel {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int tempo_viagem = entrada.nextInt();
		int velocidade = entrada.nextInt();

		double quant_litros = (tempo_viagem * velocidade) / 12.0;

		System.out.printf("%.3f\n", quant_litros);
		
		entrada.close();
	}
}