package creational;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private Connection connection;

    private DatabaseConnectionManager() {
        try {
            // Example JDBC connection (replace with your DB URL, user, and password)
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "username";
            String password = "password";
            connection = DriverManager.getConnection(url, user, password);
            Logger.getLogger(DatabaseConnectionManager.class.getName()).log(Level.INFO, "Database connection established.");
        } catch (SQLException e) {
            Logger.getLogger(DatabaseConnectionManager.class.getName()).log(Level.SEVERE, "Failed to establish database connection: " + e.getMessage());
        }
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionManager.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionManager();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
