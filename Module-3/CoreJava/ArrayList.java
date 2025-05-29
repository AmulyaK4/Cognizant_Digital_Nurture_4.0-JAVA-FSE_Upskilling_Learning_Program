import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student names (type 'end' to finish):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("end")) break;
            students.add(name);
        }

        System.out.println("Student List:");
        for (String s : students) {
            System.out.println(s);
        }
    }
}

