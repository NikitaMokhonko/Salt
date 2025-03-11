package finalExercise;

import java.util.Random;

public class Coin {


    public static void main(String args[]) {

        String side;
        String number = flip();
        System.out.println(number);

        if (number.equals("1")) {
            side = "Heads";
        } else {
            side = "Tails";
        }
    }

    public static String flip() {
        Random random = new Random();
        int number = random.nextInt(2) + 1;
        String finalNumber = Integer.toString(number);
        return finalNumber;
    }

}

