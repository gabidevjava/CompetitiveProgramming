package urijudgeonline.matematica;

import java.util.Scanner;

public class Feynman {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		while(entrada.hasNext()) {
			int n = entrada.nextInt();
			if(n == 0) break;
			
			System.out.println(n * (n + 1) * (3 * n - n + 1) / 6);
		}
		
		entrada.close();
	}
}