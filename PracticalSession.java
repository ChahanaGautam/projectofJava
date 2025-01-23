import java.sql.*;

public class PracticalSession {
        static final String URL = "jdbc:mysql://localhost:3306/manjudb";
        static final String USER = "root";
        static final String PASS = "manju123@manju";

        public static void main(String[] args) {
            Connection conn = null;
            PreparedStatement psmt = null;
            ResultSet rs = null;

            try {
                // Load MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish a connection
                conn = DriverManager.getConnection(URL, USER, PASS);

                // Insert query
                String query = "INSERT INTO CUSTOMER (ID, NAME, AGE, ADDRESS, SALARY) VALUES (?, ?, ?, ?, ?)";
                psmt = conn.prepareStatement(query);

                // Set parameters for the prepared statement
                psmt.setInt(1, 1); // Assuming ID is an integer
                psmt.setString(2, "Manju");
                psmt.setInt(3, 20);
                psmt.setString(4, "Butwal");
                psmt.setDouble(5, 20000.0);

                // Execute the update
                psmt.executeUpdate();

                // Select query to fetch data
                String selectQuery = "SELECT * FROM CUSTOMER";
                Statement stmt = conn.createStatement();
                rs = stmt.executeQuery(selectQuery);

                // Print the results
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("ID"));
                    System.out.println("Name: " + rs.getString("NAME"));
                    System.out.println("Age: " + rs.getInt("AGE"));
                    System.out.println("Address: " + rs.getString("ADDRESS"));
                    System.out.println("Salary: " + rs.getDouble("SALARY"));
                }
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (psmt != null) psmt.close();
                    if (conn != null) conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }

