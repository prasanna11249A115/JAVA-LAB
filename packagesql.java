import java.sql.Connection;
import java.sql.DriverManager;
class packagesql {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/your_database_name";
            String username = "your_username";
            String password = "your_password";
            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to the database successfully!");

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
