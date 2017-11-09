/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayLindeList;

import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Dragos
 */
public class List {
    
    LinkedList<ArrayObjClass> library = new LinkedList();
    Scanner scan = new Scanner(System.in);
    private int nrBooks;
    
    public void createList(){
     ArrayObjClass book = new ArrayObjClass("LearnJava","GAP","336-66-65",565);
 
     ArrayObjClass book1 = new ArrayObjClass();
     book1.setName("Learn C++");
     book1.setAutor("George Dinca");
     book1.setIsbn("256-6325-652");
     book1.setNrpag(256);
     
     
     
     library.add(book);
     library.add(book1);
   
    System.out.println("Introdu si alte carti : ");
    System.out.println("Cate carti vrei sa introduci : ");
    nrBooks =scan.nextInt();
     
     for (int i=0 ; i <nrBooks; i++){
         
         ArrayObjClass newbook = new ArrayObjClass();
         
         System.out.println("Intrduceti datele pt cartea " + (i+1) + " :");
         
          System.out.println("Titlul cartii :");
          newbook.setName(scan.next());
          
          System.out.println("Autorul cartii :");
          newbook.setAutor(scan.next());
          
          System.out.println("ISBN-ul cartii :");
          newbook.setIsbn(scan.next());
          
          System.out.println("Numarul de pagini  cartii :");
          newbook.setNrpag(scan.nextInt());
          library.add(newbook);
    
     }
    }
    public void printArray(){
        System.out.println("Containarul de tip LinkkedList contine : ");
        System.out.println(library);
   
    }
}