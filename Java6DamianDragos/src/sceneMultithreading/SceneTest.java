/*
 * main methode for sceneMultithreading;
 */
package sceneMultithreading;

/**
 *
 * @author Dragos
 */
public class SceneTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        //create an Television instance(object) 
        Television tv = new Television();
        
        //create instances (threads)
        Cigar cigar = new Cigar();
        VacuumCleaner cleaner = new VacuumCleaner();
        Man man =new Man(tv);
        Woman woman = new Woman(tv);
        
        //Starting threads
        cigar.start();
        cleaner.start();
        man.start();
        woman.start();
        
        
        
        
    }
    
}
