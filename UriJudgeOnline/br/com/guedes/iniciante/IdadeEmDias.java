package br.com.guedes.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);

		int idadeEmDias = entrada.nextInt();

		int anos = idadeEmDias / 365;
		int meses = (idadeEmDias % 365) / 30;
		int dias = (idadeEmDias % 365) % 30;

		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		entrada.close();
	}
}