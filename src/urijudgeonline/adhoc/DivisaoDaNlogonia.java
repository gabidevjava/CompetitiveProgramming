package urijudgeonline.adhoc;

import java.util.Scanner;

public class DivisaoDaNlogonia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int k, n, m, x, y, i;

		while (true) {
			k = entrada.nextInt();

			if (k == 0)break;

			n = entrada.nextInt();
			m = entrada.nextInt();

			for (i = 0; i < k; i++) {
				x = entrada.nextInt();
				y = entrada.nextInt();

				 if (x == n || y == m) System.out.println("divisa");
				 else if (x > n && y > m) System.out.println("NE");
				 else if (x > n && y < m) System.out.println("SE");
				 else if (x < n && y > m) System.out.println("NO");
				 else if (x < n && y < m) System.out.println("SO");
			}
		}
		entrada.close();
	}
}