package urijudgeonline.adhoc;

import java.util.Scanner;

public class DivisaoDaNlogonia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int k = entrada.nextInt();

		for (int i = 0; i < k; i++) {
			int n = entrada.nextInt();
			int m = entrada.nextInt();
			int x = entrada.nextInt();
			int y = entrada.nextInt();

			if (x == n || y == m) {
				System.out.println("divisa");
			} else if (x > n && y > m) {
				System.out.println("NE");
			} else if (x > n && y < m) {
				System.out.println("SE");
			} else if (x < n && y > m) {
				System.out.println("NO");
			} else if (x < n && y < m) {
				System.out.println("SO");
			}
		}
		entrada.close();
	}
}