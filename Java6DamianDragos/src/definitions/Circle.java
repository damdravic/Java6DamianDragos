/*
 * Test Driven Development - Plane figures definitions
 */
package definitions;

/**
 *
 * @author Dragos
 */
public class Circle extends Figure{
      
    private static final String DEFINITION = "CIRCLE   : whose boundary (the circumference) consists of \n" +
"           points equidistant from a fixed point (the centre)";
    
     @Override
     public String getDefinition(){
         String figure = super.getDefinition();
         StringBuilder circleDefinition =new StringBuilder("");
         circleDefinition.append(DEFINITION);
         circleDefinition.insert(11, figure);
         
        
        return circleDefinition.toString();
    }
}
