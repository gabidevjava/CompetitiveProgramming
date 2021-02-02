package urijudgeonline.matematica;

import java.util.Scanner;

public class VoltaFaculdadeDeFisica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int v,t, multiplicador, soma;

		while (entrada.hasNext()) {
			v = entrada.nextInt();
			t = entrada.nextInt();
			
			multiplicador = v * t;
			soma = multiplicador + multiplicador;
			
			System.out.println(soma);
		}
		entrada.close();
	}
}