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
public class NameReading {
    
    private String nume;
    private String prenume1;
    private String prenume2;
    
    public void nameReading(){
    VerificareNrPrenume v = new VerificareNrPrenume();
    Scanner scan = new Scanner(System.in);
    v.setNrp();
    int x = v.getNrp();
    
    if (x == 1 || x == 2){
    System.out.println("Introduceti numele : " );
    this.nume = scan.nextLine();
    System.out.println("Introduceti primul prenume : " );
    this.prenume1 = scan.nextLine();
    }
      else{
    System.out.println("Pot afisa initialele la nume cu 1 sau 2 prenume." );
    nameReading();
    }
    if(x == 2){
        System.out.println("Introduceti al doilea prenume : " );
        this.prenume2 = scan.nextLine();
    }
    
  
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume1() {
        return prenume1;
    }

    public String getPrenume2() {
        return prenume2;
    }
    
    
    
}
