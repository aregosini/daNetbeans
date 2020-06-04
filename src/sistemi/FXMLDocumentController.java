/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemi;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author vasil
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label LabelPort;
    @FXML
    private Label LabelServer;
    @FXML
    private Label LabelMessage;
    @FXML
    private Label LabelMessage1;
    @FXML
    private Button BtSend;
    @FXML
    private TextField TxtServer;
    @FXML
    private TextField TxtPort;
    @FXML
    private TextField TxtMessage;
    @FXML
    private TextField TxtResponse;
    @FXML
    private Button btEND;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String v[]=new String[1]; // far partire la classe EchoServer
        try {
            EchoServer.main(v);
        } catch (Exception ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    

    @FXML
    private void Send(ActionEvent event) {
        int temp=Integer.parseInt(TxtPort.getText());
        String v[]=new String[1];
        UDPSender.main(v,temp,TxtMessage.getText());
        TxtResponse.setText("Messaggio spedito al Server:"+ TxtServer.getText()); 
        
    }
   @FXML
    private void end(ActionEvent event) {
        System.exit(0);       
                
    }
    
}
