/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOP;

import java.util.Scanner;

/**
 *
 *  @author Dragos
 */
public class Calculator {
    
                 //instantierea claselor Processes, Scanner, Screen
    Processes proces = new Processes();
    Scanner read = new Scanner(System.in);
    Screen ecran = new Screen();
                //declarare a 2 variabile folosite pt verificarea paritatii dintre operanzi si operatori
   private static int operatorNr = 1;
   private static int operandNr = 1;
   
    
               //metoda ce invoca metoda din Screen cu valoare trimisa spre argument
   public void turnOn(){
       ecran.displayTurnedOn(0);
   } 
   
                
    public void displayMessage(){
        if(operatorNr == operandNr){                               // verificarea paritatii
              operandNr++;                                         //incrementare
              ecran.displayMessageIntro("Enter new operand : ");   //invocare metoda din Screen 
              String sircaractere =read.nextLine();                //creem o variabila  -- sircaractere  -- 
              Double operand = Double.valueOf(sircaractere);       // transforman sirul de caractere in integer
                   if(proces.getFirstOperand() == null){           //verificam daca operatorul 1 a fost setat
                       proces.setFirstOperand(operand);            //setarea primului operand
                       displayMessage();                           //reluarea procesului din metoda --Recursive Methods
                         }
                  else{
                       proces.setSecondOperand(operand);          //setarea operandului 2
                       Double result = proces.calculeaza();        //apelarea metodei ce calculeaza
                       ecran.displayMessageIntro("Result = " + result.toString());// afisarea rezultatului
                            }
                                    }
        //citirea operatorului
        else{
            operatorNr++;
            ecran.displayMessageIntro("Enter operator : ");
            String sircaractere = read.nextLine();
            Character operator = sircaractere.charAt(0);
            proces.setOperator(operator);
            displayMessage();
        }
       
      
      
    }
   
   }
   
    

