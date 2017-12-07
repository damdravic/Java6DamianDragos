/*
 * junit test for Triangle.java
 */
package definitionTDD;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dragos
 */
public class TriangleIT {
    
    public TriangleIT() {
    }

    /**
     * Test of getDefinition method, of class Triangle.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Triangle instance = new Triangle();
        String expResult = "Figura geometrica plana data de trei puncte distincte necoliniare.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
