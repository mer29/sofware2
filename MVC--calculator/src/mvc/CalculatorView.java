/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author meron
 */
public class CalculatorView extends JFrame {
    
    private final JTextField firstNumber = new JTextField(10);
    private final JTextField oprator = new JTextField(3);
    private final JTextField secondNumber = new JTextField(10);
    private final JButton calculateButton = new JButton("Calculate");
    private final JTextField calculatedSolution = new JTextField(10);

    public CalculatorView() {
        
        JPanel calcPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,50);
       
        calcPanel.add(firstNumber);
        calcPanel.add(oprator);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calculatedSolution);
        
        this.add(calcPanel);
        
        
    }
    
    public double getFirstNumber()
    {
      return Double.parseDouble(firstNumber.getText());
    }
    
    public String getOprator()
    {
      return oprator.getText();
    }
    
    public double getSecondNumber()
    {
      return Double.parseDouble(secondNumber.getText());
    }
    
    public double getCalcSolulation()
    {
      return Double.parseDouble(calculatedSolution.getText());
    }
    
    public void setCalcSolulation(double solution)
    {
      calculatedSolution.setText(Double.toString(solution));
    }
    
    public void addCalculationListener(ActionListener listenerButton)
    {
      calculateButton.addActionListener(listenerButton);
    }
    
    public void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(this, errorMessage);
    }    
}