package chapter4;

import java.util.Locale;
import java.util.Scanner;

public class LetterSearch {
    public static void main(String args[]){

        System.out.println("Enter your word: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next().toLowerCase();

        boolean letterFound = false;

        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'a'){
                letterFound = true;
                break;

                }
            }

        if(letterFound) {
            System.out.println("Your word contains the letter A!");
        }
        else{
            System.out.println("Your word doesn't contain the letter A :(");
            }
    }


    }

