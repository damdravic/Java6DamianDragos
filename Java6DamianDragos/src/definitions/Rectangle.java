/*
 *Test Driven Development -Plane figures definitions
 */
package definitions;

/**
 *
 * @author Dragos
 */
public class Rectangle extends Figure{

 private static final String DEFINITION = "RECTANGLE: with four straight sides and four right angles, \n" +
"           especially one with unequal adjacent sides, in contrast to a square";
 
     @Override
     public String getDefinition(){
         String figure = super.getDefinition();
         StringBuilder rectangleDefinition =new StringBuilder("");
         rectangleDefinition.append(DEFINITION);
         rectangleDefinition.insert(11, figure);
         
        
        return rectangleDefinition.toString();
    
}
}
