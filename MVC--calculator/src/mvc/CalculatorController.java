/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author meron
 */
public class CalculatorController {
    
    private final CalculatorModel model;
    private final CalculatorView view;
   

    public CalculatorController(CalculatorView theView,CalculatorModel theModel) {
        this.model = theModel;
        this.view = theView;
        
        this.view.addCalculationListener(new CalculateListener());
    }   
    
    private class CalculateListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            double firstNum,secondNum = 0;
            String oprator;
            boolean error = false;
            
            try {
                firstNum = view.getFirstNumber();
                secondNum = view.getSecondNumber();
                oprator = view.getOprator();
                
                switch (oprator){
                    case "+":
                        model.addTwoNumbers(firstNum, secondNum);
                        break;
                    case "-":
                        model.subtractTwoNumbers(firstNum, secondNum);
                        break;
                    case "/":
                        model.divideTwoNumbers(firstNum, secondNum);
                        break;
                    case "*":
                        model.multiplyTwoNumbers(firstNum, secondNum);
                        break;
                    default:
                        view.displayErrorMessage("unknown oprator");
                        error = true;
                        break;                        
                }
               if(!error){
                   view.setCalcSolulation(model.getCalculatedValue());
               }
                
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("You need to enter 2 Integers");
            }
        }
    
    } 
}
