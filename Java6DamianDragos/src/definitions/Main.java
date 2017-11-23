/*
 *Test Driven Development -Plane figures definitions
 */
package definitions;

/**
 *
 * @author Dragos
 */
public class Main {
    
   
    
    public static void main(String[] args){
        Menu  menu = new Menu();
        menu.firstQuest();
        menu.principalMenu();
        Layer list =new Layer();
        list.introducing(menu.getNrOfElements());
        list.printList();
        
    }
    
}
