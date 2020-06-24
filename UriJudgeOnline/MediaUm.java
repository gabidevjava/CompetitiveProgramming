package mediaum;
import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class MediaUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        
        double media = ((a*3.5) + (b*7.5)) / 11; 
        
        System.out.printf("MEDIA = %.5f\n", media);
    }
    
}
