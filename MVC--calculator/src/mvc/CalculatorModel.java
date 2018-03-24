/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author meron
 */
public class CalculatorModel {
    
    private double calculatedValue;
    
    public void addTwoNumbers(double firstNum,double secondNum)
    {
      calculatedValue = firstNum + secondNum; 
    }

    public void subtractTwoNumbers(double firstNum,double secondNum)
    {
      calculatedValue = firstNum - secondNum; 
    }
    
    public void multiplyTwoNumbers(double firstNum,double secondNum)
    {
      calculatedValue = firstNum * secondNum; 
    }
    
    public void divideTwoNumbers(double firstNum,double secondNum)
    {
      calculatedValue = firstNum / secondNum; 
    }
    
    public double getCalculatedValue() {
        return calculatedValue;
    }
}
