package calculosimples;

import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class CalculoSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int peca    = entrada.nextInt();
        int peca1   = entrada.nextInt();
        double unit = entrada.nextDouble();
        
        int peca2    = entrada.nextInt();
        int peca3    = entrada.nextInt();
        double unita = entrada.nextDouble();
        
        double total = (peca1 * unit) + (peca3 * unita);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
    }
    
}
