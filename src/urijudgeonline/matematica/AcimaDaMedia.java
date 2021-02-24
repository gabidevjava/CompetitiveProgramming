package urijudgeonline.matematica;

import java.util.Scanner;

public class AcimaDaMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int c = entrada.nextInt();
		int n = entrada.nextInt();
		int m;
		float soma, s;

		for (int i = 0; i < c; i++) {
			m = entrada.nextInt();

			soma = 0;
			s = 0;
			int[] num = new int[n];

			for (int ii = 0; ii < n; ii++) {
				soma+=num[ii];
			}

			soma /= n;

			for (int iii = 0; iii < n; iii++) {
				if (num[iii] > soma) s++;
			}
			
			System.out.printf("%.3f%c\n", s / n * 100.000, '%');
			c--;
		}

		entrada.close();
	}

}