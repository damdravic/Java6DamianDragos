/*
 * junit test for Rectangle.java
 */
package definitionTDD;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dragos
 */
public class RectangleIT {
    
    public RectangleIT() {
    }

    /**
     * Test of getDefinition method, of class Rectangle.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Rectangle instance = new Rectangle();
        String expResult = "Figura geometrica plana data de 4 puncte, care are toate unghiurile drepte.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
