/*
 * create connection with JAVA DB server
 */
package firstdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dragos
 */
public class MyConnection {

    private static String baseurl = "jdbc:derby://localhost:1527/";
    private static String db ="FIRSTDB";
    private static String table ="FIRSTTABLE";
    private static String username = "Dragos";
    private static String password = "3122";
    
    //private static String url = baseurl + db;
            
    private static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private static Connection conn;

    public static String getTable() {
        return table;
    }

    public static Connection getConnection(){
                 try{
                     Class.forName(driver);
                     try{
                     conn = DriverManager.getConnection(baseurl + db,username,password) ;
                     System.out.println("You are connected to Database  ");
                     
                     }catch(SQLException ex){
                         System.out.println("Failed to connect to database !!!" + ex.getMessage());
                         
                         
                     }
                 } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver not found");
        }

       return conn;



    }

        
    
    
    
}
