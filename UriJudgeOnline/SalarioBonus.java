package salariobonus;

import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class SalarioBonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        String nome     = entrada.nextLine();
        double salario  = entrada.nextDouble();
        double vendas   = entrada.nextDouble();
        
        double total    = ((vendas * 15) /100) + salario;
        
        System.out.printf("TOTAL = R$ %.2f\n", total);               
    }
    
}
