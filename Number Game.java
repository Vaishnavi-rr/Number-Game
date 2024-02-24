import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minNumber = 1;
        int maxNumber = 100;
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between " + minNumber + " and " + maxNumber + ". Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
            } else if (userGuess < randomNumber) {
                System.out.println("Try higher!");
            } else {
                System.out.println("Try lower!");
            }
        }

        scanner.close();
    }
}
