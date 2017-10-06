/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOP;

/**
 *
 * @author Dragos
 */
public class Processes {
    
    
    private Double firstOperand;
    private Double secondOperand;
    private Double result;
    private Character operator;
    
        //getter  pentru primul operand
    public Double getFirstOperand() {
        return firstOperand;
    }
       // setter pentru primul operand
    public void setFirstOperand(Double firstOperand) {
        this.firstOperand = firstOperand;
    }
    
     public Double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Double secondOperand) {
        this.secondOperand = secondOperand;
    }
    
     public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }
    
    private Double add(){
        result = firstOperand + secondOperand;
        return result;
    }
    
    private Double substract(){
        result = firstOperand - secondOperand;
        return result;
    }
    
    private Double multiply(){
        result = firstOperand * secondOperand;
        return result;
    }
    
    private Double divide(){
        result = firstOperand / secondOperand;
        return result;
    }
    
    public Double calculeaza(){
        
        switch(operator){
            case'+':
                add();
                break;
            case'-':
                substract();
                break;   
            case'*':
                multiply();
                break;  
            case'/':
                divide();
                break;     
        }
        return result;
    }
    
    
    
}
