package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]){
        System.out.println("Enter the amount of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for(int i=0; i<quantity; i++){

            System.out.println("How much does your item cost?");
            double price = scanner.nextDouble();
            total += price;
        }

        scanner.close();
        System.out.println("Your total is going to be $ " + total);
    }

}
