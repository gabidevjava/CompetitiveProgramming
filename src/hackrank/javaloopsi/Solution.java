package hackrank.javaloopsi;

import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int entrada = scanner.nextInt();

		for(int multiplicador = 1; multiplicador <= 20; multiplicador++) {
			if(multiplicador == entrada) {
				for(int contador = 1; contador <= 10; contador++) {
					System.out.println(entrada + " x " + contador + " = " +(multiplicador * contador));
				}
				System.out.println();
			}
        }
	}
}