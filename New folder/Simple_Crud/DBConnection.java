package Simple_Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/springjdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";


    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load the driver
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }


//    public static void main(String[] args) {
//        try {
//            Connection conn = getConnection();
//            if (conn != null) {
//                System.out.println("Connection Successful");
//                conn.close(); // Close after use
//            } else {
//                System.out.println("Connection Failed");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
