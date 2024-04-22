import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class InputScanner {
    private static final java.util.Scanner scanner = new Scanner(System.in);

    public static String scanChars(boolean onlyOneLetter, Set<Character> allowedChars) {

        String userInput;
        System.out.println();

        while (true) {
            System.out.print("Your answer: ");
            userInput = scanner.nextLine().toLowerCase();

            if(onlyOneLetter && userInput.length() > 1) {
                System.out.println("Please enter only one letter");
                continue;
            }

            if (!userInput.matches("[a-zA-Z]+")) {
                System.out.println("Please enter letters only");
                continue;
            }

            if (!checkAllowedChars(userInput, allowedChars)) {
                System.out.println("Please choose only existing answer");
                continue;
            }

            break;
        }

        return userInput;
    }

    public static int scanNumber(ArrayList<Integer> allowedQuizzesNumber) {
        int userInputNumber;
        while (true) {
            System.out.print("Choose number: ");
            try {
                userInputNumber = scanner.nextInt();
                scanner.nextLine();

                if(!allowedQuizzesNumber.contains(userInputNumber)) {
                    System.out.println("Please select only an existing quiz!");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input is not a number: " + e.getMessage());
                scanner.nextLine();
            }
        }

        return userInputNumber;
    }

    public static boolean continuePlay() {
        System.out.println();

        while (true) {
            System.out.print("You want to continue to torture your brain (y/n) ?: ");
            String usertInput = scanner.nextLine().toLowerCase();

            if(usertInput.equals("y")) return true;
            if(usertInput.equals("n")) return false;

            System.out.println("Pls choose only y or n");
        }
    }

    public static boolean checkAllowedChars(String userInput, Set<Character> allowedChars) {
        for (Character ch : userInput.toCharArray()) {
            if (!allowedChars.contains(ch)) return false;
        }
        return true;
    }
}