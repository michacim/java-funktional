package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DBConnect als Singleton==nur eine Instanz
 */
public class DBConnect {
    private Connection con;
    private static final String HOST ="jdbc:mysql://localhost:3306/ihk_persons";
    private static final String USERNAME="root";
    private static final String PASSWORD="";

    private static DBConnect instance = null;
    private DBConnect(){

        try {
            con = DriverManager.getConnection(HOST,USERNAME,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DBConnect getInstance(){  //DBConnect.getInstance()
        if(instance==null){
            instance = new DBConnect();
        }

        return instance;
    }
    public Connection connection(){
        return con;
    }
}
