package br.com.guedes.iniciante;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int y = entrada.nextInt();

		int resultado = y * 2;

		System.out.println(resultado + " minutos");
		
		entrada.close();
	}
}