package urijudgeonline.iniciante;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num_fun = entrada.nextInt();
		int horas_trab = entrada.nextInt();
		double valor_horas = entrada.nextDouble();

		double sala_func = (valor_horas * horas_trab);

		System.out.println("NUMBER = " + num_fun);
		System.out.printf("SALARY = U$ %.2f\n", sala_func);
		
		entrada.close();
	}
}