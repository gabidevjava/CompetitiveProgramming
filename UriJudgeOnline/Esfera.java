package esfera;

import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class Esfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        double r      = entrada.nextDouble();
        
        double esfera = (4.0/3) * 3.14159 * r * r * r;
        
        System.out.printf("VOLUME = %.3f\n", esfera);
                      
    }
    
}
