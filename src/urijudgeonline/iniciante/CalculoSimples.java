package urijudgeonline.iniciante;

import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int peca1   = entrada.nextInt();
        double unit = entrada.nextDouble();
        
        int peca3    = entrada.nextInt();
        double unita = entrada.nextDouble();
        
        double total = (peca1 * unit) + (peca3 * unita);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
        entrada.close();
    }
}