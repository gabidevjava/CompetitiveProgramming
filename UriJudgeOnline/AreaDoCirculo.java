package areadocirculo;
import java.util.*;
/**
 *
 * @author azooiverde
 */
public class AreaDoCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        double r    = scan.nextDouble();
        double area = 3.14159 * r * r;
        
        System.out.printf("A=%.4f\n", area);
        
    }
    
}
