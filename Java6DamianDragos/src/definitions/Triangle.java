/*
 * Test Driven Development -Plane figures definitions
 */
package definitions;

/**
 *
 * @author Dragos
 */
public class Triangle extends Figure {
    
    private static final String DEFINITION ="TRIANGLE : with three straight sides and three angles.\n";
    
    public String getDefinition(){
        
        String figure = super.getDefinition();
        StringBuilder triangleDefinition = new StringBuilder("");
        triangleDefinition.append(DEFINITION);
        triangleDefinition.insert(11, figure);
        
        return triangleDefinition.toString();
        
        
        
    }
    
 
}
