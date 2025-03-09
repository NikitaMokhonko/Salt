package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String args[]){
       String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
       System.out.println("Input the number corresponding to the day of the week (1-7): ");
       Scanner scanner = new Scanner(System.in);
       int inputNumber = scanner.nextInt() - 1;
       System.out.println(daysOfTheWeek[inputNumber]);
       scanner.close();


    }
}
