// 85.create a table manufacturers
// Try to insert at least 10 records in the above table
// Try to insert at least 2 records with null value
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class CreateManufacturersTable {
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
            String dropSQL = "DROP TABLE IF EXISTS manufacturers";
            stmt.executeUpdate(dropSQL);

            // Create table
            String createTableSQL = "CREATE TABLE manufacturers ("
                    + "ManufacturerID INT PRIMARY KEY, "
                    + "Name VARCHAR(100), "
                    + "Country VARCHAR(50), "
                    + "FoundedYear INT"
                    + ")";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'manufacturers' created successfully.");

            // Insert 10 records
            String insertSQL = "INSERT INTO manufacturers (ManufacturerID, Name, Country, FoundedYear) VALUES "
                    + "(1, 'Sony', 'Japan', 1946),"
                    + "(2, 'Samsung', 'South Korea', 1938),"
                    + "(3, 'Apple', 'USA', 1976),"
                    + "(4, 'Dell', 'USA', 1984),"
                    + "(5, 'HP', 'USA', 1939),"
                    + "(6, 'Lenovo', 'China', 1984),"
                    + "(7, 'Asus', 'Taiwan', 1989),"
                    + "(8, 'LG', 'South Korea', 1958),"
                    + "(9, 'Acer', 'Taiwan', 1976),"
                    + "(10, 'Toshiba', 'Japan', 1875)";
            stmt.executeUpdate(insertSQL);
            System.out.println("10 records inserted successfully.");

            // Insert 2 records with NULL values
            String insertNullSQL = "INSERT INTO manufacturers (ManufacturerID, Name, Country, FoundedYear) VALUES "
                    + "(11, NULL, NULL, NULL),"
                    + "(12, 'Unknown Inc.', NULL, NULL)";
            stmt.executeUpdate(insertNullSQL);
            System.out.println("2 records with NULL values inserted successfully.");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
// This Java program creates a table named 'manufacturers' in a database, inserts 10 records into it, and also inserts 2 records with NULL values.
// Make sure to have a 'db.properties' file with the database connection details before running this program.