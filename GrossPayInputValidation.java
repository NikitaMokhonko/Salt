package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]){

        int rate = 15;
        int maxHours =40;

        System.out.println("How many hours did you work this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry, your hours need to be 1-40");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $ " + gross);
    }
}
