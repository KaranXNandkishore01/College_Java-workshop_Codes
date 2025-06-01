// 83. Create a table Item_dtls (Electronics)
// Try to insert at least 10 records in the above table
// Try to insert at least 2 records with null value

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class CreateItemTable {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017 (AIML)");

        Connection conn = null;
        Statement stmt = null;

        try {
            // Load database properties
            Properties props = new Properties();
            props.load(new FileInputStream("db.properties"));

            // Establish connection
            conn = DriverManager.getConnection(props.getProperty("db.url"), props);
            stmt = conn.createStatement();

            // Drop table if it exists to avoid duplicate table error (optional)
            String dropSQL = "DROP TABLE IF EXISTS Item_dtls";
            stmt.executeUpdate(dropSQL);

            // Create table
            String createTableSQL = "CREATE TABLE Item_dtls ("
                    + "ItemID INT PRIMARY KEY,"
                    + "ItemName VARCHAR(100),"
                    + "ItemPrice DECIMAL(10, 2),"
                    + "ItemCategory VARCHAR(50)"
                    + ")";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table Item_dtls created successfully.");

            // Insert 10 records
            String insertSQL = "INSERT INTO Item_dtls (ItemID, ItemName, ItemPrice, ItemCategory) VALUES "
                    + "(1, 'Laptop', 800.00, 'Electronics'),"
                    + "(2, 'Smartphone', 500.00, 'Electronics'),"
                    + "(3, 'Tablet', 300.00, 'Electronics'),"
                    + "(4, 'Smartwatch', 200.00, 'Electronics'),"
                    + "(5, 'Headphones', 100.00, 'Electronics'),"
                    + "(6, 'Charger', 20.00, 'Electronics'),"
                    + "(7, 'USB Cable', 10.00, 'Electronics'),"
                    + "(8, 'Bluetooth Speaker', 150.00, 'Electronics'),"
                    + "(9, 'Monitor', 250.00, 'Electronics'),"
                    + "(10, 'Keyboard', 30.00, 'Electronics')";
            stmt.executeUpdate(insertSQL);
            System.out.println("10 records inserted successfully.");

            // Insert records with NULL values
            String insertNullSQL = "INSERT INTO Item_dtls (ItemID, ItemName, ItemPrice, ItemCategory) VALUES "
                    + "(11, NULL, NULL, NULL),"
                    + "(12, 'Unknown', NULL, 'Electronics')";
            stmt.executeUpdate(insertNullSQL);
            System.out.println("2 records with NULL values inserted successfully.");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            // Clean up
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
// Note: Ensure that the db.properties file contains the correct database connection details.
// Example db.properties file content:
// db.url=jdbc:mysql:           //localhost:3306/your_database
// db.username=your_username
// db.password=your_password
// Make sure to replace 'your_database', 'your_username', and 'your_password' with actual values.
// Also, ensure that the MySQL JDBC driver is included in your classpath.