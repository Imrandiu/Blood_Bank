package gateway;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBClass {
    static private Connection  connection;

    public static Connection getConnection() throws Exception{
        if(connection == null){
            //JDBC
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            //Class.forName("org.sqlite.JDBC");
            //connection = DriverManager.getConnection("jdbc:sqlite:bbms.sqlite");
        }
        return connection;
    }
    
}
