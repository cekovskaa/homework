import java.sql.*;
public class PostgresConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the Postgres database");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}