package hackrank.javaifelse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        if (numero % 2 == 0 && numero >= 2 && numero <= 5) {
            System.out.println("Not Weird");
        }
        else if(numero % 2 == 0 && numero >= 6 && numero <= 20)    {
            System.out.println("Weird"); 
        }
        else if(numero % 2 == 0 && numero > 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
        
        input.close();
    }

}