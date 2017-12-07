/*
 * Creating definition for Rectangle
 */
package definitionTDD;

/**
 *
 * @author Dragos
 */
public class Rectangle extends Shape2D{
    
    protected String definition = " data de 4 puncte, care are toate unghiurile drepte.";
    
    public String getDefinition(){
        
          String parentDefinition = super.definition;  
          
          String finaldefinition = parentDefinition + definition ;
            
        return finaldefinition ;
        
        }
    
    
    
}
