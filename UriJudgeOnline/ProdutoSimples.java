package produtosimples;
import java.util.Scanner;
/**
 *
 * @author azooiverde
 */
public class ProdutoSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
          
         int a = entrada.nextInt();
         int b = entrada.nextInt();
         
         int produto = a * b;
        
        
        System.out.println("PROD = " + produto);
    }
    
}
