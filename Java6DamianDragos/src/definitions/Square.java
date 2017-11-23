/*
 *Test Driven Development -Plane figures definitions
 */
package definitions;

/**
 *
 * @author Dragos
 */
public class Square extends Figure{
    
    private static final String DEFINITION = "SQUARE   : with four equal straight sides and four right angles.\n";
    
    
    public String getDefinition(){
        
        String figure = super.getDefinition();
        StringBuilder squareDefinition = new StringBuilder("");
        squareDefinition.append(DEFINITION);
        squareDefinition.insert(11, figure);
        
        return squareDefinition.toString();
        
    }
    
}
