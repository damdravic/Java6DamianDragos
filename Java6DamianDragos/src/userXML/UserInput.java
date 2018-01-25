/*
 * class for input username and password
 */
package userXML;

import java.util.Scanner;

/**
 *
 * @author Dragos
 */

class UserInput {
    
    Scanner scan = new Scanner(System.in);
    private String inUsername;
    private String inPassword;
    
    public void userInput(){
        System.out.println("Username : ");
        inUsername = scan.nextLine();
        System.out.println("Password : ");
        inPassword = scan.nextLine();
 
    }

    public String getInUsername() {
        return inUsername;
    }

    public String getInPassword() {
        return inPassword;
    }
    
    
    
    
    
    
    
}
