/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author yyy
 */
public class AuthenticationController implements Initializable {
    
    @FXML
    JFXTextField PINTextField;
    
    @FXML
    AnchorPane authenticateAP;
    
    @FXML
    private void authenticate(ActionEvent event) {
        String pin = PINTextField.textProperty().getValue();

        if (pin.equals("1111")){
            Utility.getInstance().navigate("ATMMenu.fxml", authenticateAP);
        }
    }   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
