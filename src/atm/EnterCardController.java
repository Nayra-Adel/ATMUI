/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author yyy
 */
public class EnterCardController implements Initializable {

    @FXML
    AnchorPane CardNumberAP;
    @FXML
    private JFXButton continueCardNumButton;
    @FXML
    private JFXTextField cardNumTextField;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void validateCard(ActionEvent event) {
        String cardNum = cardNumTextField.textProperty().getValue();

        if (cardNum.equals("1111")){
            Utility.getInstance().navigate("Authentication.fxml", CardNumberAP);
        }
    }
    
    
}
