package testingGround;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String username = userName(scanner);
        String currentPass = oldPassword(scanner);
        boolean newPasswordCheck = false;


        while(newPasswordCheck == false) {
            String newPass = newPassword(scanner);
            newPasswordCheck = totalCheck(newPass, username, currentPass);

            if (newPasswordCheck == false) {
                System.out.println("Your password did not meet the criteria. Please try again.");
            }
        }

    System.out.println("Congrats! Your password passes the requirements.");
    scanner.close();
    }

    public static String userName(Scanner scanner) {
        System.out.println("Enter your username: ");
        String username = scanner.next();
        return username;
    }

    public static String oldPassword(Scanner scanner) {
        System.out.println("Enter your current password: ");
        String currentPass = scanner.next();
        return currentPass;
    }

    public static String newPassword(Scanner scanner) {

        System.out.println("Enter your desired password, it has to: \n Contain 8 characters \n Contain an uppercase letter \n Contain a special character \n Not contain your username or old password");
        String newPass = scanner.next();
        return newPass;
    }

    public static boolean totalCheck(String newPass, String username, String currentPass) {
        if (newPass.length() > 7) {
            for (int i = 0; i < newPass.length(); i++) {
                if (Character.isUpperCase(newPass.charAt(i))) {
                    for (int j = 0; j < newPass.length(); j++) {
                        if (!Character.isLetterOrDigit(newPass.charAt(j))) {
                            if (!newPass.equals(currentPass)) {
                                if (!newPass.toLowerCase().contains(username.toLowerCase())) {
                                    return true;
                                }
                            }


                        }
                    }
                }

            }

        }
        return false;

    }
}
