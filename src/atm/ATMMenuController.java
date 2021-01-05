/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author yyy
 */
public class ATMMenuController implements Initializable {

    @FXML
    AnchorPane ATMMenuAP;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void balanceInquiry(ActionEvent event) {
        System.out.println("balanceInquiry");
        navigate("BalanceInquiry.fxml");
    }
    
    @FXML
    private void transfer(ActionEvent event) {
        System.out.println("transfer");
        navigate("Transfer.fxml");
    }
    
    @FXML
    private void withdraw(ActionEvent event) {
        System.out.println("withdraw");
        navigate("Withdrawl.fxml");
    }

    @FXML
    private void cancel(ActionEvent event) {
        System.out.println("cancel");
        navigate("FXMLDocument.fxml");
    }
    
    private void navigate(String fileName) {
        Utility.getInstance().navigate(fileName, ATMMenuAP);
    }
}
