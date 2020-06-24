package consumo;

import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class Consumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int distancia  = entrada.nextInt();
        double combust = entrada.nextDouble();
        
        double total = (distancia / combust);
        
        System.out.printf("%.3f km/l\n", total);
        
    }
    
}
