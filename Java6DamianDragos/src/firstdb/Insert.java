/*
 * Read values from keyboard and create query string
 */
package firstdb;

import java.util.Scanner;

/*
 *
 * @author Drago
 */
public class Insert {
    
    
    Scanner scan = new Scanner(System.in);
    String table = MyConnection.getTable();
    
    
    
    int id ;
    String name;
    
    
    public void readValues(){
        System.out.println("Enter a value (INTEGER) for ID column :");
        id = scan.nextInt();
         System.out.println("Enter a value (STRING) for NAME column :");    
        name = scan.next();
       
         
        
    }
    
    public String insertQuery(){
    String sql = " INSERT INTO " + table + " VALUES (" + id + ",'" + name +"')" ;
          
             return sql;
             
             }
            
    
    
    
    
}
