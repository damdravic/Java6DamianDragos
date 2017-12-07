/*
* Application that launches three instances of Notepad
 */
package multiProcess;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dragos
 */
public class MultiProcess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                try {
             
            ProcessBuilder pb= new ProcessBuilder("Notepad");
            pb.directory(new File(System.getProperty("user.home"), "Desktop"));
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(MultiProcess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
    }
    }
    
}
