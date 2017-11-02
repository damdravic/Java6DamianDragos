/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initials;

/**
 *
 * @author Dragos
 */
public class InitialsT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //verificare numar nume
        NameReading initials = new NameReading();
        initials.nameReading();
        
        String nume = initials.getNume();
        String prenume1 = initials.getPrenume1();
        String prenume2 = initials.getPrenume2();
        
        String inume = nume.charAt(0) + ".";
        inume = inume.toUpperCase();
        String iprenume1 = prenume1.charAt(0) + ".";
        iprenume1 = iprenume1.toUpperCase();
        String iprenume2 ="";
        
        if(prenume2 != null){
        iprenume2 = prenume2.charAt(0) + ".";
        iprenume2 = iprenume2.toUpperCase();
        }
        
        System.out.println("Initialele numelui sunt:   "  + iprenume1 + iprenume2 + inume);
      
        
    }
    
}
