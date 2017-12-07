/*
 * Choise the type of text to look for regex
 */
package regexCNP;
import java.util.Scanner;


/**
 *
 * @author Dragos
 */
public class Choise {
    
    private enum Options { INPUT , FILE}
    private String input;
    Scanner scan = new Scanner(System.in);
  
    
    public void choise(){
        
        System.out.println("You want to search in a text file or from a input text :");
        System.out.println(" INPUT  or  FILE \n");
        input = scan.nextLine().toUpperCase();
 
        contains();
     
    }
    
    public  boolean contains() {

    for (Options c : Options.values()) {
        if (c.name().equals(input)) {
     
            return true;
        }
    }
         
     choise();
    return false;
   }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    
    
}
    
    

