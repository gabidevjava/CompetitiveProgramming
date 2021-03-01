package urijudgeonline.matematica;

import java.util.Scanner;

public class ConversaoSimplesDeBase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		while (entrada.hasNext()) {
			StringBuilder builder = new StringBuilder();
			String numero = entrada.next();

			if (numero.contains("x")) {
				String removeX = numero.replace("x", "");
				int paraDecimal = Integer.parseInt(removeX, 16);
				System.out.println(paraDecimal);
			} else {
				int numeroFormatado = Integer.valueOf(numero);
				
				if (!(numeroFormatado <= Math.pow(2, 31))) break;
				if(numeroFormatado < 0) break; 

				builder.append(Integer.toHexString(numeroFormatado));
				builder.insert(0, 0);
				builder.insert(1, "x");
				
				String toUppcase = builder.toString().substring(2, builder.length()).toUpperCase();
				String nova = builder.toString().substring(0, 2).concat(toUppcase);
				
				System.out.println(nova);
			}
		}
		entrada.close();
	}
}