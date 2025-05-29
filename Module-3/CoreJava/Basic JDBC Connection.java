import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicJDBC {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";
        String query = "SELECT * FROM students";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Student Data:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
            }
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}




