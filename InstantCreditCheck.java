package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        int c = getCreditScore();
        double s = getSalary();
        boolean qualified = isUserQualified(c,s);

        isUserQualified(c, s);
        notifyUser(qualified);
        scanner.close();

    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static double getSalary() {
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }


    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        } else {
            return false;
        }
    }
    public static void notifyUser(boolean isQualified){
        if(isQualified) {
            System.out.println("Congrats! You've been approved!");
        }
        else{
            System.out.println("We're sorry, you don't qualify.");
        }
    }
}

