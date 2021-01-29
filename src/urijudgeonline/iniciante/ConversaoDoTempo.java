package urijudgeonline.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class ConversaoDoTempo {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);

		int tempoEmSegundos = entrada.nextInt();

		int horas = tempoEmSegundos / 3600;
		int minutos = (tempoEmSegundos % 3600) / 60;
		int segundos = (tempoEmSegundos % 3600) % 60;

		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
		
		entrada.close();
	}
}