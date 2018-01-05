/*
 * Class with main methode
 */
package firstdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dragos
 */
public class FirstConnectionTest {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {

        Connection connection = MyConnection.getConnection();
        
        Insert in = new Insert();
       
       in.readValues();
       String sql = in.insertQuery();
       Statement stmt = connection.createStatement();
       stmt .executeUpdate(sql);
         
        
    }
    
}
