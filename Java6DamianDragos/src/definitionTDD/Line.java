/*
 * Creating definition for Line
 */
package definitionTDD;

/**
 *
 * @author Dragos
 */
public class Line extends Shape2D  {
    

    
 String definition = " determinata de 2 puncte.";   
        
 
 public String getDefinition(){
        
          String parentDefinition = super.definition;  
          
          String finaldefinition = parentDefinition + definition ;
            
        return finaldefinition ;
        
        }
    
    
    
}
