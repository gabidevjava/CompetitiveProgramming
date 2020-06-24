package mediadois;
import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class MediaDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        
        double media = ((a*2) + (b*3) + (c*5)) /10;
        
        System.out.printf("MEDIA = %.1f\n", media);
        
    }
    
}
