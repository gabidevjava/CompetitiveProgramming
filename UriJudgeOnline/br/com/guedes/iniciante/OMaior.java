package br.com.guedes.iniciante;
import java.util.Scanner;

public class OMaior {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        
        int mariaAB = (a + b + Math.abs (a-b)) /2 ;
        
        int abc = (mariaAB + c + Math.abs (mariaAB-c) /2);
        
        System.out.println(abc + " eh o maior");
        
        entrada.close();
    }   
}