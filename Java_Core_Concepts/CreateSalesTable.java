// 84. Create a table Sales_dtls
// Try to insert at least 10 records in the above table
// Try to insert at least 2 records with null values
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class CreateSalesTable {
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

            // Drop table if exists (optional)
            String dropSQL = "DROP TABLE IF EXISTS Sales_dtls";
            stmt.executeUpdate(dropSQL);

            // Create table
            String createTableSQL = "CREATE TABLE Sales_dtls ("
                    + "SaleID INT PRIMARY KEY, "
                    + "ProductName VARCHAR(100), "
                    + "Quantity INT, "
                    + "SaleAmount DECIMAL(10, 2), "
                    + "SaleDate DATE"
                    + ")";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table Sales_dtls created successfully.");

            // Insert 10 valid records
            String insertSQL = "INSERT INTO Sales_dtls (SaleID, ProductName, Quantity, SaleAmount, SaleDate) VALUES "
                    + "(1, 'Laptop', 2, 1600.00, '2024-06-01'),"
                    + "(2, 'Smartphone', 3, 1500.00, '2024-06-02'),"
                    + "(3, 'Tablet', 1, 300.00, '2024-06-03'),"
                    + "(4, 'Monitor', 2, 500.00, '2024-06-04'),"
                    + "(5, 'Keyboard', 5, 150.00, '2024-06-05'),"
                    + "(6, 'Mouse', 4, 80.00, '2024-06-06'),"
                    + "(7, 'Printer', 1, 200.00, '2024-06-07'),"
                    + "(8, 'Router', 2, 120.00, '2024-06-08'),"
                    + "(9, 'Speakers', 3, 180.00, '2024-06-09'),"
                    + "(10, 'Webcam', 1, 70.00, '2024-06-10')";
            stmt.executeUpdate(insertSQL);
            System.out.println("10 records inserted successfully.");

            // Insert 2 records with NULL values
            String insertNullSQL = "INSERT INTO Sales_dtls (SaleID, ProductName, Quantity, SaleAmount, SaleDate) VALUES "
                    + "(11, NULL, NULL, NULL, NULL),"
                    + "(12, 'Unknown Product', NULL, NULL, NULL)";
            stmt.executeUpdate(insertNullSQL);
            System.out.println("2 records with NULL values inserted successfully.");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            // Clean up resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
// This Java program creates a table named Sales_dtls in a database, inserts 10 valid records, and adds 2 records with NULL values.
// Ensure you have a db.properties file with the correct database connection details before running this program.