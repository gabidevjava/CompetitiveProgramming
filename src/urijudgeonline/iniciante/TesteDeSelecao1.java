package urijudgeonline.iniciante;

import java.util.Scanner;

public class TesteDeSelecao1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a = 0, b = 0, c = 0, d = 0;

		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();

		int somaDC = d + c;
		int somaAB = a + b;

		if (b > c && d > a && somaDC > somaAB && c > 0 && d > 0 && a % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}

		entrada.close();
	}

}