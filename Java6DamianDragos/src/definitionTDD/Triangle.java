/*
 * Creating definition for Triangle
 */
package definitionTDD;

/**
 *
 * @author Dragos
 */
public class Triangle extends Shape2D {
    
    protected String definition = " data de trei puncte distincte necoliniare.";
    
    
 public String getDefinition(){
        
          String parentDefinition = super.definition;  
          
          String finaldefinition = parentDefinition + definition ;
            
        return finaldefinition ;
        
        }
    
    
}
