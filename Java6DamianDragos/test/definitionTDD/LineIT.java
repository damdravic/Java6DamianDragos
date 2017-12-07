/*
 * junit test for Line.java
 */
package definitionTDD;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dragos
 */
public class LineIT {
    
    public LineIT() {
    }

    /**
     * Test of getDefinition method, of class Line.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Line instance = new Line();
        String expResult = "Figura geometrica plana determinata de 2 puncte.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
