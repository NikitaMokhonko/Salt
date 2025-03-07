package chapter2;

import java.util.Scanner;

public class AngieExercise {
    public AngieExercise() {
    }

    public static void main(String[] arg) {
        System.out.println("Write a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        System.out.println("Write a whole number: ");
        int wholeNumber = scanner.nextInt();
        System.out.println("Write an adjective: ");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " " +  season + " day, I drink a minimum of " + wholeNumber + " cups of coffee");
    }
}
