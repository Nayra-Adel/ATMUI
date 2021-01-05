/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author yyy
 */
public class Utility {
    static Utility instance;
    
    public static Utility getInstance(){
        if (instance == null){
            instance = new Utility();
        }
        return instance;
    }
    
    public void navigate(String fileName, AnchorPane sourceAnchorPane){
        try {
            AnchorPane destinationPane = FXMLLoader.load(getClass().getResource(fileName));
            sourceAnchorPane.getChildren().setAll(destinationPane);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
