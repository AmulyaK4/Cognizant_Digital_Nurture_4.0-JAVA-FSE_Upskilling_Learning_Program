import java.sql.*;

public class StudentDAO {
    Connection conn;

    public StudentDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "root", "your_password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertStudent(int id, String name) throws SQLException {
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.executeUpdate();
        stmt.close();
    }

    public void updateStudent(int id, String newName) throws SQLException {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, newName);
        stmt.setInt(2, id);
        stmt.executeUpdate();
        stmt.close();
    }
}
