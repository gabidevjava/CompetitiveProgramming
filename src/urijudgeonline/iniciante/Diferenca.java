package urijudgeonline.iniciante;

import java.util.Scanner;

public class Diferenca {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();

		int dif = (a * b - c * d);

		System.out.println("DIFERENCA = " + dif);
		
		entrada.close();
	}
}