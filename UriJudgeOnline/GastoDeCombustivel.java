package gastodecombustivel;

import java.util.Scanner;

/**
 *
 * @author azooiverde
 */
public class GastoDeCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int tempo_viagem = entrada.nextInt();
        int velocidade   = entrada.nextInt();
        
        double quant_litros = (tempo_viagem * velocidade) / 12.0;
        
        System.out.printf("%.3f\n", quant_litros);
        
    }
    
}
