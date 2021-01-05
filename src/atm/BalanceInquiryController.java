/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
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
 * FXML Controller class
 *
 * @author yyy
 */
public class BalanceInquiryController implements Initializable {
    
    @FXML
    Label balanceLabel;
    
    @FXML
    AnchorPane balanceInquiryAP;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        balanceLabel.setText("20 LE");
    }    
    
    @FXML
    private void navigateToATMMenu(ActionEvent event) {
        Utility.getInstance().navigate("ATMMenu.fxml", balanceInquiryAP);
    }
}
