/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOP;

/**
 *
 *  @author Dragos
 */
public class RunOopCalculator {
    
    static Calculator deskCalc = new Calculator();
    
    
    public static void main(String[] args) {
        // turn ON calculator
       deskCalc.turnOn();
        // read operands ond operator
       deskCalc.displayMessage();
        
    }
    
}
