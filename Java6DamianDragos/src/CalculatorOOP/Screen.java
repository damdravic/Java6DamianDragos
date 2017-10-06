
package CalculatorOOP;

/**
 *
 * @author Dragos
 */
public class Screen {
    
    private int valoareafis;
    
    //constructor cu 1 argument( valoare )
    public Screen(int valoare  ){
            this.valoareafis=valoare;
    
    }
    
    //metoda cu 1 argument ( message )
     public void displayMessageIntro(String message){
         System.out.println(message);
    
     }
     
     //constructor fara argumente
    public Screen(){
        
    }
    
    //metoda cu 1 argument ( message )
   int displayTurnedOn(int message){
      System.out.println("Calculator is ON");
        this.valoareafis = message;
       System.out.println( valoareafis  ); 
        return valoareafis;
    }
    
    
}
