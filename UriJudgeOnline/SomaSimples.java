package somasimples;
import java.util.Scanner;


/**
 *
 * @author azooiverde
 */
public class SomaSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        int A, B, SOMA;
        
        A = scan.nextInt();
        B = scan.nextInt();
        
        SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
     
    }
    
}
