package urijudgeonline.matematica;

import java.util.Scanner;

public class AcimaDaMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt(), i, s, c;
		float x;

		for (i = 0; i < n; i++) {
			int m = entrada.nextInt();
			int[] arr = new int[m];
			s = 0;
			x = 0;
			c = 0;
			for (int j = 0; j < m; j++) {
				int o = entrada.nextInt();
				arr[j] = o;
				s += arr[j];
				x = s/m;
			}
			
			for (int j = 0; j < m; j++) {
				if (x < arr[j]) c++;
				
			}
			
			System.out.printf("%.3f%%\n", ((float) c * 100) / (float) m);
		
		}

		entrada.close();
	}

}