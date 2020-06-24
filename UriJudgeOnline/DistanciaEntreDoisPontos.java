package distanciaentredoispontos;

import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class DistanciaEntreDoisPontos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        double eixoA = entrada.nextDouble();
        double eixoB = entrada.nextDouble();
        double eixoC = entrada.nextDouble();
        double eixoD = entrada.nextDouble();
        
        double distancia = Math.sqrt((eixoC - eixoA) * (eixoC - eixoA)
                + (eixoD - eixoB) * (eixoD - eixoB));
        
        System.out.printf("%.4f\n", distancia);
        
        
    }
    
}
