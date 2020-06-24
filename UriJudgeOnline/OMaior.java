package omaior;

import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class OMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        
        int mariaAB = (a + b + Math.abs (a-b)) /2 ;
        
        int abc = (mariaAB + c + Math.abs (mariaAB-c) /2);
        
        System.out.println(abc + " eh o maior");
        
    }
    
}
