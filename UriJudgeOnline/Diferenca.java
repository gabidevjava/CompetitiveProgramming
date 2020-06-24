package diferenca;

import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class Diferenca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();
        
        int dif = (a*b-c*d);
        
        System.out.println("DIFERENCA = " +dif);
    }
    
}
