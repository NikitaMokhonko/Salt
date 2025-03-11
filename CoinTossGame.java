package finalExercise;

import java.util.Scanner;

public class CoinTossGame {

    public static void main(String args[]){


        Scanner scanner = new Scanner(System.in);
        String player2guess = "1";

        String p1orp2 = "first";

        String player1name = playerName(scanner, p1orp2);
        String player1guess = playerGuess(scanner, p1orp2);

        if(player1guess.equals("1")){
            player2guess = "2";}
        else if(player1guess.equals("2")){
            player2guess = "1";
        }

        p1orp2 = "second";
        String player2name = playerName(scanner, p1orp2);

        Player player1 = new Player(player1name, player1guess);
        Player player2 = new Player(player2name, player2guess);

        Coin coin = new Coin();

        String flipResult = coin.flip();

        if(flipResult.equals("1")){
            System.out.println("\nThe coin landed on heads, meaning");
        }
        else{
            System.out.println("\nThe coin landed on tails, meaning");
        }

        if(flipResult.equals(player1guess)){
            System.out.println("Player " + player1.name + " won!");
        }
        else{
            System.out.println("Player " + player2.name + " won!");
        }


        scanner.close();



    }
    public static String playerName(Scanner scanner, String p1orp2){
        System.out.println("Enter the "+ p1orp2 +" player's name: ");
        String playername = scanner.next();
        return playername;
    }
    public static String playerGuess(Scanner scanner, String p1orp2){
        do {System.out.println("Enter " + p1orp2 + " player's guess, 1 for heads and 2 for tails : ");
            String playerGuess = scanner.next();
            if (playerGuess.equals("1")){
                return playerGuess;}
            else if (playerGuess.equals("2")){
                return playerGuess;}
            else {System.out.println("\nInvalid input, try again.\n");}}
        while(true);


    }
}
