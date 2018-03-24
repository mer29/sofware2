/*
 * This is a simple calculator done in model view control architecture.
 * 
 * Meron Terefe
   ATE/9384/08
 */
package mvc;

/**
 *
 * @author meron
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
     
      
        CalculatorController controller = new CalculatorController(view, model);
      
        view.setVisible(true);
    }
    
}
