package salario;

import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada    = new Scanner(System.in);
        
        int num_fun        = entrada.nextInt();
        int horas_trab     = entrada.nextInt();
        double valor_horas = entrada.nextDouble();
        
        double sala_func   = (valor_horas * horas_trab);
        
        System.out.println("NUMBER = " +num_fun);
        System.out.printf("SALARY = U$ %.2f\n", sala_func);
        
    }
    
}
