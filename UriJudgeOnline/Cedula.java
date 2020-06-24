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

        int N = entrada.nextInt();

        if (N > 0 && N < 1000000) {

            System.out.println(N);
            System.out.println(N/ 100 + " nota(s) de R$ " + "100,00");
            System.out.println((N % 100) / 50 + " nota(s) de R$ " + "50,00");
            System.out.println((N % 100) % 50 / 20 + " nota(s) de R$ " + "20,00");
            System.out.println((N % 100) % 50 % 20 / 10 + " nota(s) de R$ " + "10,00");
            System.out.println((N % 100) % 50 % 20 % 10 / 5 + " nota(s) de R$ " + "5,00");
            System.out.println((N % 100) % 50 % 20 % 10 % 5 / 2 + " nota(s) de R$ " + "2,00");
            System.out.println((N % 100) % 50 % 20 % 10 % 5 % 2 / 1 + " nota(s) de R$ " + "1,00");

        }
 
    }
 
}
