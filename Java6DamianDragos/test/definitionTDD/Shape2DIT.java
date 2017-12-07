/*
 * junit test for Shape2D.java
 */
package definitionTDD;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dragos
 */
public class Shape2DIT {
    
    public Shape2DIT() {
    }

    /**
     * Test of getDefinition method, of class Shape2D.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Shape2D instance = new Shape2D();
        String expResult = "Figura geometrica plana";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
