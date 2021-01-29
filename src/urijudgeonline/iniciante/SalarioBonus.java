package urijudgeonline.iniciante;

import java.util.Scanner;

public class SalarioBonus {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double salario = entrada.nextDouble();
		double vendas = entrada.nextDouble();

		double total = ((vendas * 15) / 100) + salario;

		System.out.printf("TOTAL = R$ %.2f\n", total);	
		
		entrada.close();
	}
}