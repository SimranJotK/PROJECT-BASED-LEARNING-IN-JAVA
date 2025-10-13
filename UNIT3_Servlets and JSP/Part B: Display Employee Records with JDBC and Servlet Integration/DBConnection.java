import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";  // your MySQL username
        String pass = "password"; // your MySQL password
        return DriverManager.getConnection(url, user, pass);
    }
}
