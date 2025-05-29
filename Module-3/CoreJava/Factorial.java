import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int number = input.nextInt();
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("The factorial of " + number + " is: " + result);
    }
}

