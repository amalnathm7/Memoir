/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoir;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import javafx.util.Duration;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author amaln
 */
public class LoginController implements Initializable {

    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private Button login;
    @FXML
    private Button signup;
    @FXML
    private Button forgotpassword;
    @FXML
    private BorderPane border;
    @FXML
    private AnchorPane mainpane;
    @FXML
    private VBox vbox;
    @FXML
    private Label label;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }

    @FXML
    private void signUp(javafx.event.ActionEvent event) throws IOException {
    
        Parent parent = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        
        signup.getScene().setRoot(parent);    
    }
    
    @FXML
    private void logIn(javafx.event.ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        
        Scene scene = new Scene(parent, login.getScene().getWidth(), login.getScene().getHeight());
        
        Stage stage = (Stage) login.getScene().getWindow();
        stage.setScene(scene);
    }
}
