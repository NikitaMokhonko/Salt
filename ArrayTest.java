package testingGround;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("You will have to enter 5 numbers that you want to put in the array.");
        int[] finalNumbers = numberInput(scanner);
        System.out.println(Arrays.toString(finalNumbers));
        int searchNumber = userSearchNumber(scanner);
        boolean searchResult = arraySearchResult(finalNumbers, searchNumber);
        scanner.close();
        if(searchResult == true){
            System.out.println("Your number has been found in the array!");
        }
        else{
            System.out.println("Your number is not in the array.");
        }

    }

    public static int[] numberInput(Scanner scanner) {


        int[] finalNumbers = new int[5];

        for(int i = 0; i < 5; i++) {
            int number = i + 1;
            System.out.println("Enter number " + number + ": ");
            int userNumber = scanner.nextInt();
            finalNumbers[i] = userNumber;
        }

        return finalNumbers;
    }


    public static int userSearchNumber(Scanner scanner) {
        System.out.println("Enter a number you would like to search for within the array: ");
        int searchNumber = scanner.nextInt();
        return searchNumber;
    }


    public static boolean arraySearchResult(int[] finalNumbers, int searchNumber){

        boolean isNumberFound = false;

        for(int i = 0; i<5; i++){
            if(finalNumbers[i] == searchNumber){
                isNumberFound = true;
                break;
            }
        }

        return isNumberFound;
    }

}
