package JDBC;

import java.sql.*;

public class TestConnection {
    private static final String url = "jdbc:postgresql://localhost:5433/demo4";
    private static final String user = "postgres";
    private static final String password = "master";
    public static Statement statement;
    public static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connection");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    static{
        try {
            statement = connection.createStatement();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        User user = new User(1, "Чынгыз" , "Таев", 18 );
        User user2 = new User(2,"Нурлан ", "Таев" , 24);
        System.out.println();
        System.out.println(insertUser(user2));
    }

    private static User insertUser(User user){
        String SQL = "INSERT INTO taev(id, first_name, last_name, age_) " +
                "VALUES(?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getFirst_name());
            preparedStatement.setString(3, user.getLast_name());
            preparedStatement.setInt(4, user.getAge_());
            return  preparedStatement.executeUpdate() > 0 ? user : null;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
 class User{
    private int id;
    private String first_name;
    private String last_name;
    private int age_;

     public User(int id, String first_name, String last_name, int age_) {
         this.id = id;
         this.first_name = first_name;
         this.last_name = last_name;
         this.age_ = age_;
     }

     public int getId() {
         return id;
     }

     public String getFirst_name() {
         return first_name;
     }

     public String getLast_name() {
         return last_name;
     }

     public int getAge_() {
         return age_;
     }

     @Override
     public String toString() {
         return "user{" +
                 "id=" + id +
                 ", first_name='" + first_name + '\'' +
                 ", last_name='" + last_name + '\'' +
                 ", age_=" + age_ +
                 '}';
     }
 }
