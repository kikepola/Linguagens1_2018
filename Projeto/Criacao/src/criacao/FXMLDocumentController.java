/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    private TextField txtModelo;
    
    @FXML
    private TextField txtMarca;
    
    @FXML
    private TextField txtPlaca;
    
    @FXML
    private TextField txtAno;
    
    @FXML
    private TextField txtPais;
    
    @FXML
    private Button btnCriar;
    
    @FXML
    private Button btnLista;
    
    private ArrayList<Carro> listadeCarros;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Carro c1 = new Carro(txtModelo.getText());
        c1.setAno(txtAno.getText());
        c1.setMarca(txtMarca.getText());
        c1.setOrigem(txtPais.getText());
        c1.setPlaca(txtPlaca.getText());
        listadeCarros.add(c1);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listadeCarros = new ArrayList<>();
    }    
    
    @FXML
    public void verLista(ActionEvent event){
       for(Carro carro : listadeCarros){
           System.out.println(""+carro);
       }
    }
    
}
