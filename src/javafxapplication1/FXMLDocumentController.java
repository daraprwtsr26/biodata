/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Daraprwtsr
 */
public class FXMLDocumentController implements Initializable {

     
    @FXML
    private TextField Nama;

    @FXML
    private TextField Alamat;

    @FXML
    private TextField Absen;

    @FXML
    private TextField Telpon;

    @FXML
    Button buttonProses;

    @FXML
    private TextArea textArea;
    
    @FXML
    void Proses(ActionEvent event) {
        String nama = Nama.getText();
        String absen = Absen.getText();
        String alamat = Alamat.getText();
        String telpon = Telpon.getText();
        
        textArea.setText("Nama anda: "+nama+"\nAbsen: "+absen+"\nAlamat: "+alamat+"\nTelpon: "+telpon);

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
