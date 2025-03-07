package chapter3;

import java.util.Scanner;

public class NewLoanQualifier {
    public static void main(String args[]){

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        int yearAmt = scanner.nextInt();

        scanner.close();

        if(salary >= requiredSalary && yearAmt >= requiredYearsEmployed) {
            System.out.println("Congratulations! You qualify for the loan!");
        }
        else{
            System.out.println("We're sorry, you don't qualify for the loan");
        }
    }
}
