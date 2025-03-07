package chapter4;

import java.security.KeyStore;
import java.util.Scanner;

public class AddNumbers {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean again;

        do {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double numSum = num1 + num2;
            System.out.println("Adding these numbers makes " + numSum);

            while (true) {
                System.out.println("Would you like to start again? Write yes or no");
                String tf = scanner.next().toLowerCase();

            if (tf.equals("yes")) {
                again = true;
                break;
            } else if (tf.equals("no")) {
                again = false;
                break;
            } else {
                System.out.println("Please write yes or no");
            }
            }

            }


        while(again);

        scanner.close();
    }
}
