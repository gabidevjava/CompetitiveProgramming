package urijudgeonline.matematica;

import java.util.Scanner;

public class EncaixaOuNaoI {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		String a, b;

		for (int i = 0; i < n; i++) {
			a = entrada.next();
			b = entrada.next();

			if (a.length() == b.length()) {
				int aa = Integer.valueOf(a);
				int bb = Integer.valueOf(b);

				if (aa == bb) {
					System.out.println("encaixa");
				} else {
					System.out.println("nao encaixa");
				}
			} else {
				int bb = Integer.valueOf(b);

				if (a.length() == 2 && b.length() != 2) {
					System.out.println("nao encaixa");
				} else {
					String novaA = a.substring(a.length() - b.length());
					int novaAA = Integer.valueOf(novaA);

					if (bb == novaAA) {
						System.out.println("encaixa");
					} else {
						System.out.println("nao encaixa");
					}
				}
			}
		}
		entrada.close();
	}
}