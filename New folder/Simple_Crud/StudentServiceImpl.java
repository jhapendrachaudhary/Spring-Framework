package Simple_Crud;

import java.sql.*;
import java.util.Scanner;

public class StudentServiceImpl implements Crud{
    @Override
    public void insert() {
        try (Connection conn = DBConnection.getConnection();
             Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();  // consume newline
            System.out.print("Enter address: ");
            String address = sc.nextLine();

            String sql = "INSERT INTO students_info (name, age, address) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, address);

            int rows = stmt.executeUpdate();
            System.out.println(rows + " student(s) added.");

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
        @Override
    public void update() {
            try (Connection conn = DBConnection.getConnection();
                 Scanner sc = new Scanner(System.in)) {

                System.out.print("Enter student ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                System.out.print("Enter new age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new address: ");
                String address = sc.nextLine();

                String sql = "UPDATE students_info SET name = ?, age = ?, address = ? WHERE id = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, name);
                stmt.setInt(2, age);
                stmt.setString(3, address);
                stmt.setInt(4, id);

                int rows = stmt.executeUpdate();
                System.out.println(rows + " student(s) updated.");
            } catch (Exception e) {
                e.printStackTrace();
            }

    }

    @Override
    public void delete() {
        try (Connection conn = DBConnection.getConnection();
             Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter student ID to delete: ");
            int id = sc.nextInt();

            String sql = "DELETE FROM students_info WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            int rows = stmt.executeUpdate();
            System.out.println(rows + " student(s) deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void read() {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM students_info";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("ID\tName\tAge\tAddress");
            while (rs.next()) {
                System.out.printf("%d\t%s\t%d\t%s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
