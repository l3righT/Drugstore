package myframe;


import java.sql.*;

public class Connect{
    
    public static Connection ConnectDB() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://sql12.freemysqlhosting.net/sql12312493";
            Connection con = DriverManager.getConnection(url, "sql12312493", "Lxy7dFkp1C");
            return con;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
