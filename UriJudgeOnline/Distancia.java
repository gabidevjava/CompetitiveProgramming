package distancia;

import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class Distancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int y = entrada.nextInt();
        
        int resultado = y * 2;
        
        System.out.println(resultado + " minutos");
        
    }
    
}
