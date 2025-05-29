import java.sql.*;

public class TransactionDemo {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "root", "your_password")) {
            conn.setAutoCommit(false);

            PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");

            debit.setDouble(1, 1000);
            debit.setInt(2, 1);

            credit.setDouble(1, 1000);
            credit.setInt(2, 2);

            debit.executeUpdate();
            credit.executeUpdate();

            conn.commit();
            System.out.println("Transaction successful!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
