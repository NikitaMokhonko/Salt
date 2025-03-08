package chapter4;

import java.util.Random;

public class DiceRollGame {
    public static void main(String args[]){

        Random random = new Random();
        System.out.println("The point of this game is to get to space 20 within 5 dice rolls!");


        int score = 0;

        for(int i=0; i<5; i++){
                int die = random.nextInt(6) + 1;
                score += die;
                int spacesLeft = 20 - score;

                if(score < 20) {
                    System.out.println("You rolled a " + die + ", you're on space " + score + ", you've got " + spacesLeft + " spaces to go!");
                     if (i == 4) {
                        System.out.println("You haven't reached the goal in 5 rolls, and therefore lost :(");
                        break;
                    } else {
                        continue;
                    }
                }
                else if(score == 20 && i < 4) {
                    System.out.println("You rolled a " + die + ", which means that you won in 4 rolls! Impressive.");
                    break;
                }
                else if(score == 20){
                    System.out.println("Congrats, you rolled a " + die + ", landed on " + score + " and won!");
                    break;
                }
                else{
                    System.out.println("You rolled a " + die + " and therefore overshot :(");
                    break;

                }



                }
            }


            }




