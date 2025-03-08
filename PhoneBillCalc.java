package chapter5;

import java.util.Scanner;

public class PhoneBillCalc {
    public static void main(String args[]){
        System.out.println("Please enter your plan fee: ");
        Scanner scanner = new Scanner(System.in);
        double planFee = scanner.nextDouble();
        System.out.println("Please enter the number of overage minutes: ");
        double minutes = scanner.nextDouble();
        scanner.close();

        double overageFees = overageFees(minutes);
        double preTaxTotal = preTaxTotal(planFee, overageFees);
        double total = total(preTaxTotal);
        double tax = tax(total, preTaxTotal);
        bill(total, preTaxTotal, overageFees, planFee, tax);


    }
    public static double overageFees(double minutes){
        double overageFees = minutes * 0.25;
        return overageFees;
    }
    public static double preTaxTotal(double planFee, double overageFees){
        double preTaxTotal = overageFees + planFee;
        return preTaxTotal;
    }
    public static double total(double preTaxTotal){
        double total = preTaxTotal * 1.15;
        return total;
    }
    public static double tax(double total, double preTaxTotal){
        double tax = total - preTaxTotal;
        return tax;
    }
    public static void bill(double total, double preTaxTotal, double overageFees, double planFee, double tax){
        System.out.println("Your bill for this period: \nPlan fee: " + planFee + "\nOverage: " + overageFees + "\nTax: " + tax + "\nTotal after tax: " + total + "\nTotal pre-tax: " + preTaxTotal);
    }
}
