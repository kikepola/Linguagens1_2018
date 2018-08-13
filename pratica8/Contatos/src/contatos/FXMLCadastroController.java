/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contatos;

import java.net.URL;
import java.util.ArrayList;
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
public class FXMLCadastroController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField txtNome;
    
    @FXML
    private TextField txtEmail;
    
    @FXML
    private TextField txtTel;
    
    private ArrayList<Contato> listadeContatos;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        Contato c1 = new Contato(txtNome.getText());
        c1.setEmail(txtEmail.getText());
        c1.setTelefone(txtTel.getText());
        listadeContatos.add(c1);
        //System.out.println("Contato" + " " + c1);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listadeContatos = new ArrayList<>();
    }   
    
    @FXML
    public void verLista(ActionEvent event){
        for(Contato contato : listadeContatos){
            System.out.println(""+ contato);
        }
    }
    
}
