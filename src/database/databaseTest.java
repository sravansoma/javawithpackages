package database;
import java.sql.*;

public class databaseTest {

    public static void main(String[]args) throws Exception {
        String url = "";
        String uname = "root";
        String pass = "";
        //load and register the jdbc
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
    }
}
