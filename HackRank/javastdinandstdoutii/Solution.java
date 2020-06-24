package javastdinandstdoutii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        final Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        input.useLocale(Locale.US);

        Object numberInt = null;
        Object floatingPoint = null;
        Object phrase = null;

        while (input.hasNext()) {
            numberInt = input.next();
            floatingPoint = input.nextDouble();
            phrase = input.nextLine();

            if (phrase instanceof String) {
                phrase = input.nextLine();
                break;
            } else if (numberInt instanceof Integer) {
                numberInt = input.nextInt();
                break;
            } else if (floatingPoint instanceof Double) {
                floatingPoint = input.nextDouble();
                break;
            }
        }

        System.out.println("String: " + (String) phrase);
        System.out.println("Double: " + floatingPoint);
     //   System.out.printf("Double: %.4f\n", floatingPoint);
        System.out.println("Int: " + numberInt);

        input.close();
    }
}