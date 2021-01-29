package br.com.guedes.iniciante;

import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		int b = entrada.nextInt();

		int produto = a * b;

		System.out.println("PROD = " + produto);
		
		entrada.close();
	}
}