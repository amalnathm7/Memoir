/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
public class NotenewController extends HomepageController implements Initializable {

    @FXML
    private AnchorPane notepane;
    @FXML
    private Button attach;
    @FXML
    private Button redo;
    @FXML
    private Button delete;
    @FXML
    private TextArea description;
    @FXML
    private TextField title;
    @FXML
    private Button save;
    @FXML
    private Label label;
    @FXML
    private ComboBox<String> combo;
    
    ObservableList<String> list = FXCollections.observableArrayList("Add new category...");
    
    @FXML
    private Button addCategory;
    @FXML
    private TextField newCombo;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        combo.setItems(list);
    }
    
    @FXML
    private void saveBtn (javafx.event.ActionEvent event) throws IOException {
        String titleStr = title.getText();
        String descriptionStr = description.getText();
        String category = combo.getPromptText();
        
        Stage stage = (Stage) save.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void addCombo (javafx.event.ActionEvent event)
    {
        if(!newCombo.getText().isEmpty()){
            list.remove("Add new category...");
            list.add(newCombo.getText());
            combo.setItems(list);
        }
    }

}
