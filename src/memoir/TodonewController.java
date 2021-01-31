/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author amaln
 */
public class TodonewController extends HomepageController implements Initializable {

    @FXML
    private AnchorPane journalpane;
    @FXML
    private Button attach;
    @FXML
    private Button redo;
    @FXML
    private Button delete;
    @FXML
    private DatePicker enddate;
    @FXML
    private TextArea description;
    @FXML
    private TextField title;
    @FXML
    private Button save;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void saveBtn (javafx.event.ActionEvent event) throws IOException {
        /*java.sql.Date stdateValue;
        java.sql.Date endateValue;
        if(startdate.getValue() != null)
            stdateValue = java.sql.Date.valueOf(startdate.getValue());
        if(enddate.getValue() != null)
            endateValue = java.sql.Date.valueOf(enddate.getValue());*/
        try {
            RestClient.create_todo(title.getText(), description.getText(), enddate.getValue().toString(), LoginController.auth);
            
            Stage stage = (Stage) save.getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "", ButtonType.OK);
            alert.showAndWait();

            if (alert.getResult() == ButtonType.OK) {
                alert.close();
            }
        }
    }
}
