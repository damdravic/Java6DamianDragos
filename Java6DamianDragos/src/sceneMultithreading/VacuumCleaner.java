/*
 * Vacuum cleaner thread
 */
package sceneMultithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dragos
 */
public class VacuumCleaner extends Thread{
    
     @Override
    public void run(){
         try {
             //delay this thread to be displayed after women and man thread
             Thread.sleep(400);
             //display thread message
             System.out.println("The vacuum cleaner sucks");
         } catch (InterruptedException ex) {
             Logger.getLogger(VacuumCleaner.class.getName()).log(Level.SEVERE, null, ex);
         }
   }
    
    
}
