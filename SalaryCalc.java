package chapter3;

import java.util.Scanner;

public class SalaryCalc {

    public static void main(String args[]){

        int salary = 1000;
        int bonus = 250;

        System.out.println("How many sales did you make this week? ");
        Scanner scanner = new Scanner(System.in);
        int salesAmt = scanner.nextInt();
        scanner.close();

        int totalSalary = salary + salesAmt * bonus;


        if(salesAmt < 10)
                System.out.println("Your salary will be $" + salary);
        else
            System.out.println("Your salary will be $" + totalSalary);
    }
}
