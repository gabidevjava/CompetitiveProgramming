package urijudgeonline.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Cedula {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);

		int N = entrada.nextInt();

		if (N > 0 && N < 1000000) {

			System.out.println(N);
			System.out.println(N / 100 + " nota(s) de R$ " + "100,00");
			System.out.println((N % 100) / 50 + " nota(s) de R$ " + "50,00");
			System.out.println((N % 100) % 50 / 20 + " nota(s) de R$ " + "20,00");
			System.out.println((N % 100) % 50 % 20 / 10 + " nota(s) de R$ " + "10,00");
			System.out.println((N % 100) % 50 % 20 % 10 / 5 + " nota(s) de R$ " + "5,00");
			System.out.println((N % 100) % 50 % 20 % 10 % 5 / 2 + " nota(s) de R$ " + "2,00");
			System.out.println((N % 100) % 50 % 20 % 10 % 5 % 2 / 1 + " nota(s) de R$ " + "1,00");

		}
		
		entrada.close();
	}
}