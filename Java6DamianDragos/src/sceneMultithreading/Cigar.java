/*
 * class Cigar for cigar thread 
 */
package sceneMultithreading;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Dragos
 */
public class Cigar extends Thread{
    
    @Override
    public void run(){
        try {
            //delay this thread to be displayed after women and man thread
            Thread.sleep(500);
            //display thread message
            System.out.println("Cigar is burning...");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Cigar.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
    
}
