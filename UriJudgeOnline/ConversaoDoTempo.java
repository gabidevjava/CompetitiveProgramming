import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);

        int tempoEmSegundos = entrada.nextInt();

        int horas = tempoEmSegundos / 3600;
        int minutos = (tempoEmSegundos % 3600) / 60;
        int segundos = (tempoEmSegundos % 3600) % 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
 
    }
 
}
