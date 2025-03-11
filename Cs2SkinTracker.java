package testing;

import java.util.ArrayList;
import java.util.Scanner;

public class Cs2SkinTracker {

    static ArrayList<Skin> inventory = new ArrayList<>();

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean placeholder = true;


        do {
            int depositOrInspect = depositOrInspect(scanner);
            if (depositOrInspect == 3){
                System.out.println("Shutting down. Thank you for using the program!");
                break;}
            else if (depositOrInspect == 2) {
                System.out.println("Your inventory consists of: ");
                for (int i = 0; i < inventory.size(); i++) {
                    System.out.println(inventory.get(i));
                }
                System.out.println("\nSending you back to main menu.");
            }
            else if (depositOrInspect == 1){
                boolean isStatTrak = false;
                System.out.println("Enter the name of your skin: ");
                String skinName = scanner.nextLine();

                System.out.println("Enter the weapon type of your skin: ");
                String skinType = scanner.nextLine();

                System.out.println("Enter the condition of your skin: ");
                String skinCond = scanner.nextLine();

                System.out.println("Type 1 if your skin is StatTrak, type 2 if not: ");
                int statTrak = scanner.nextInt();
                scanner.nextLine();
                if (statTrak == 1){
                    isStatTrak = true;}
                else{
                    isStatTrak = false;}
                System.out.println("\nSkin has been added! Returning to main menu.");
                Skin newSkin = new Skin(skinName, skinType, skinCond, isStatTrak);
                inventory.add(newSkin);
                }
            else {
                System.out.println("\nInvalid input, try again.");
            }

        } while (placeholder);

    }

    public static int depositOrInspect(Scanner scanner) {
        System.out.println("\n    MAIN MENU \n\n1. Deposit a skin\n2. View inventory \n3. Exit \n\nChoose an option: ");
        int depositOrInspect = scanner.nextInt();
        scanner.nextLine();
        return depositOrInspect;
    }


    }



