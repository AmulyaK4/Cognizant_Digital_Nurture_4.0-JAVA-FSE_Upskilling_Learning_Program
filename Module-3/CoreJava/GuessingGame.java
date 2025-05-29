import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int target = generator.nextInt(100) + 1;
        int userGuess = -1;

        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it:");

        while (userGuess != target) {
            userGuess = input.nextInt();

            if (userGuess < target) {
                System.out.println("Too low! Guess again:");
            } else if (userGuess > target) {
                System.out.println("Too high! Guess again:");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
            }
        }
    }
}

