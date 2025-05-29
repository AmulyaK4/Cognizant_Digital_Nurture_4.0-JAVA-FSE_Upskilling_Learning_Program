import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }
}

