import java.sql.*;

public class Main {
    private static final String url = "jdbc:postgresql://localhost:5433/";
    private static final String user = "postgres";
    private static final String password = "master";

    public static void main(String[] args) {
        Main main = new Main();
        main.getUser();
    }
    public void getUser(){
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM product");
            while (rs.next()){
                String str = rs.getString("id") + ":" + rs.getString(2);
                System.out.println("Contact:" + str);
            }
            conn.close();
            st.close();
            rs.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
