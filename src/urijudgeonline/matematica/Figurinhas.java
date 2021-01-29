package urijudgeonline.matematica;

import java.util.Scanner;

public class Figurinhas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n,a,b;
		int dividendo, divisor, c;
		
		n = entrada.nextInt();
		
		for (int i = 0; i < n; ++i) {
			a = entrada.nextInt();
			b = entrada.nextInt();
			
			if(b > a ) {
				dividendo = b;
				divisor = a;
			} else {
				dividendo = a;
				divisor = b;
			}
			
			while (dividendo % divisor != 0) {
				c = dividendo % divisor;
				dividendo = divisor;
				divisor = c;
			}
			
			System.out.println(divisor);
		}
		
		entrada.close();
	}
}