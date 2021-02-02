package urijudgeonline.matematica;

import java.util.Scanner;

public class EncaixaOuNaoI {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		String a, b;
		
		for (int i = 0; i <= n; i++) {
			a = entrada.nextLine();
			b = entrada.nextLine();
			
			if (a.length() == 1 || b.length() == 1) {
				System.out.println("encaixa");
			} else if (a.length() == 2 || b.length() == 2) {
				String novaA = a.substring(0, 2);
				String novaB = b.substring(0, 2);

				int aaa = Integer.valueOf(novaA);
				int bbb = Integer.valueOf(novaB);

				if (aaa == bbb) {
					System.out.println("encaixa");
				} else {
					System.out.println("nao encaixa");
				}
			} else if (b.length() == 2 && a.length() != 2) {
				System.out.println("nao encaixa");
			} else if (a.length() == 2 && b.length() != 2) {
				System.out.println("nao encaixa");
			} else {
				String novaA = a.substring(0, 3);
				String novaB = b.substring(0, 3);

				int aaa = Integer.valueOf(novaA);
				int bbb = Integer.valueOf(novaB);

				if (aaa == bbb) {
					System.out.println("encaixa");
				} else {
					System.out.println("nao encaixa");
				}
			}
		}

		entrada.close();
	}
}