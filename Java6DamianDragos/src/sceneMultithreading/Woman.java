/*
 * class for woman thread
 */
package sceneMultithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dragos
 */
public class Woman  extends Thread{
    
      Television syncObject;
      
    public Woman(Television television){
        syncObject = television;
    }
    
      @Override
    public void run(){
        synchronized(syncObject) {
          try{
            
            System.out.println("The women is sliping with the cigar burning ... in hand");
          //waiting notify from  man thread
            syncObject.wait();
           } catch(InterruptedException e){
             e.getStackTrace();}
          
          
            try {
                //delay for man-thread  have time to display massage
                Thread.sleep(1000);
                System.out.println("women   -Thank you, if you did not wake me I was sleeping much longer.");
            } catch (InterruptedException ex) {
                Logger.getLogger(Woman.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
       }
    
    
}
