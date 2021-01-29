package urijudgeonline.iniciante;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A, B, SOMA;

		A = scan.nextInt();
		B = scan.nextInt();

		SOMA = A + B;

		System.out.println("SOMA = " + SOMA);
		
		scan.close();
	}
}