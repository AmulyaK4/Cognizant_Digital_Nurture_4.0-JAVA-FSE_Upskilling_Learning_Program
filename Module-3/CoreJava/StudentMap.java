import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 student ID and name pairs:");
        for (int i = 0; i < 3; i++) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            map.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        if (map.containsKey(searchId)) {
            System.out.println("Name: " + map.get(searchId));
        } else {
            System.out.println("ID not found.");
        }
    }
}

