/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcfortest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dragos
 */
public class ButtonIT {
    
    public ButtonIT() {
    }

    /**
     * Test of pushButton method, of class Button.
     */
    @Test
    public void testPushButton() {
        System.out.println("pushButton");
        Button instance = new Button();
        instance.drawOnButton('x');
        Character expResult = 'x';
        Character result = instance.pushButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of drawOnButton method, of class Button.
     */
    @Test
    public void testDrawOnButton() {
        System.out.println("drawOnButton");
        Character markup = 'y';
        Button instance = new Button();
        instance.drawOnButton(markup);
         Character result = instance.pushButton();
        assertEquals(markup, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
