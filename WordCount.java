package testingGround;

import java.util.Scanner;

public class WordCount {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String userMessage = userMessage(scanner);
        int numberOfWords = countWords(userMessage);
        System.out.println("Your message contains " + numberOfWords + " words!");
        scanner.close();

    }

    public static String userMessage(Scanner scanner){
        System.out.println("Enter your message, and I will count the words within!");
        String message = scanner.nextLine();
        return message;

    }

    public static int countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        return numberOfWords;
    }
}
