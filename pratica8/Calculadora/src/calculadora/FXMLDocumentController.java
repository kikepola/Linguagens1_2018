/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 16.00026-9
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField varX;
    
    @FXML
    private TextField varY;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void somar(ActionEvent event){
        double x = Double.parseDouble(varX.getText());
        double y = Double.parseDouble(varY.getText());
        double total = x + y;
        label.setText(""+total);
        
    }
    @FXML
    public void multiplicar(ActionEvent event){
        double x = Double.parseDouble(varX.getText());
        double y = Double.parseDouble(varY.getText());
        double total = x * y;
        label.setText(""+total);
        
    }
    @FXML
    public void dividir(ActionEvent event){
        double x = Double.parseDouble(varX.getText());
        double y = Double.parseDouble(varY.getText());
        double total = x / y;
        label.setText(""+total);
        
    }
    @FXML
    public void subtrair(ActionEvent event){
        double x = Double.parseDouble(varX.getText());
        double y = Double.parseDouble(varY.getText());
        double total = x - y;
        System.out.println("Sub");
        label.setText(""+total);
        
    }
    
}
