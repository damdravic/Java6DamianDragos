/*
 * Test Driven Development -Plane figures definitions
 */
package definitions;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dragos
 */
public class Menu {
    
        int nrOfElements;
    // ghidarea userului pt a introduce figurile dorite in multime
    public void principalMenu(){
      System.out.println("Deci doresti ca multimea ta sa aiba \""+nrOfElements+"\" figuri geometrice : \n"
                + "Introdu te rog \n"
                + "           1- pentru CERC  \n"
                + "           2- pentru DREPTUNGHI \n"
                + "           3- pentru PATRAT \n"
                + "           4- pentru TRIUNGHI");
        
        
    }
    // setarea de catre user a marimii multimii
    public void firstQuest(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate elemente doresti sa introduci in multime : ");
        try{
        this.nrOfElements = scan.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("-------Introodu te rog un numar intreg.-------");
            firstQuest();
        }
    }

   
    
    public int getNrOfElements() {
        return nrOfElements;
    }

    public void setNrOfElements(int nrOfElements) {
        this.nrOfElements = nrOfElements;
    }
    

    
    
}
