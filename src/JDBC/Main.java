package JDBC;

import java.sql.*;

import static JDBC.TestConnection.connection;

public class Main {
    private static final String url = "jdbc:postgresql://localhost:5433/";
    private static final String user = "postgres";
    private static final String password = "master";

    public static void main(String[] args) {
        getTrainersCount();
        System.out.println(getProducts());
    }

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connect");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static int insertUser (User user){
        String SQL = "INSERT INTO employee(id, name, age) " +
                "VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, user.getId());
//            preparedStatement.setString(2, user.getName());
//            preparedStatement.setInt(3, user.getAge());
            return  preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }


    public static int getTrainersCount() {
        String SQL = "SELECT count(*) FROM trainers";
        int count = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static int getProducts() {
        String SQL = "SELECT * FROM product WHERE product_name LIKE 'Ch%'";
        int count = 0;
        Connection conn = null;
        try {
            conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                System.out.println(rs.getLong("id") +
                        " - " + rs.getString("product_name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return count;
    }
}
