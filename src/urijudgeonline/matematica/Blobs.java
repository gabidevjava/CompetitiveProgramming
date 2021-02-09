package urijudgeonline.matematica;

import java.util.Scanner;

public class Blobs {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt(), dias;
		float c;
		
		for(int i = 0; i < n; i++) {
			c = entrada.nextFloat();
			
			dias = 0;
			
			while(c > 1) {
				c /= 2;
				dias++;
			}
			
			System.out.println(dias + " dias");
		}
		entrada.close();
	}
}