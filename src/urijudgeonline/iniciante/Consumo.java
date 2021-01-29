package urijudgeonline.iniciante;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int distancia = entrada.nextInt();
		double combust = entrada.nextDouble();

		double total = (distancia / combust);

		System.out.printf("%.3f km/l\n", total);

		entrada.close();
	}
}