package chapter3;

import java.util.Scanner;

public class CoinGame {
    public static void main(String args[]){

        double totalValue = 0;
        double winValue = 1;
        Scanner scanner = new Scanner(System.in);


        while(totalValue < winValue) {

            System.out.println("Enter coin you want to deposit: ");
            String coin = scanner.next().toLowerCase();

            if (coin.equals("penny")) {
                totalValue += 0.01;
            } else if (coin.equals("nickel")) {
                totalValue += 0.05;
            } else if (coin.equals("dime")) {
                totalValue += 0.1;
            } else if (coin.equals("quarter")) {
                totalValue += 0.25;
            } else {
                System.out.println("Invalid option.");
            }
        }

    scanner.close();
    System.out.println("You've won! The right amount was " + totalValue);

        }





    }
