/*
 * Test Driven Development -Plane figures definitions
 * 
 */
package definitions;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedList;


/**
 *
 * @author Dragos
 */
public class Layer {
    //crearea scanerului,a listei si a obiectelor - figuri geometrice
    Scanner scan = new Scanner(System.in);
    LinkedList<Integer> myList = new LinkedList<>();
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Square square = new Square();
    Triangle triangle = new Triangle();
    
    
    /**
     *
     * @param h
     * 
     * 
     * 
     */
    
    
     // inserarea in lista o optiunilor (acum de tip int)  introduse  
               // de user si gestionarea erorilor
    public void introducing(int h){
        
        for (int i = 1; i<= h ;i++){
            int input = 0;
            while (input <1 || input >4){  
            System.out.println("Introdu elementul "+ i);
            try{
            input = scan.nextInt();
            }
            catch(InputMismatchException e){
                scan.next();
            }
              if(input<1 || input>4){
                   System.out.println("!!! Atentie ... Introdu te rog doar 1,2,3 sau 4 !!!");
                   System.out.println("--- Esti la introducerea elementului nr : " + i +"---");
              }

           }

            int element = input ;
            myList.add(element);
            
        }
    }
    /**
     *
     */
    
    //inlocuirea elementelor de tip int din lista cu definitiile corespunzatoare
        // si printarea listei
    public void printList(){
    
        for (int i = 0; i < myList.size(); i++) {
            
            int item =myList.get(i);
            switch (item) {
            case 1:   System.out.println(circle.getDefinition());
                     break;
            case 2:   System.out.println(rectangle.getDefinition());
                     break;
            case 3:  System.out.println(square.getDefinition());
                     break;
            case 4:   System.out.println(triangle.getDefinition());
                     break;
            
            default:  System.out.println("ceva nu e bine");
                     break;
            
     
        }
              }
      
      
      
      
    }   
        
    }
    
    
    
    
    

