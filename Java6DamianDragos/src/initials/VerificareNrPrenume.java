/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initials;
import java.util.Scanner;
/**
 *
 * @author Dragos
 */
public class VerificareNrPrenume {
    Scanner scan =  new Scanner(System.in);
    private int nrp;
    int[] posibility={1,2};
    
    public int getNrp(){
        return nrp;
    }
    

    
    public void setNrp(){ 
        
        System.out.println("Cate prenume aveti?");
        String input;
        input = scan.nextLine();
        try{
        this.nrp = Integer.parseInt(input);
        }
        catch(NumberFormatException e){
             System.out.println("Incearca un numar intreg.");
             setNrp();
        }
        
        
        
      
        
        
        
          
            
       
   
    }
    
}
