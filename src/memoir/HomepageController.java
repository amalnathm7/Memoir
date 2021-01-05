/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author amaln
 */
public class HomepageController implements Initializable {

    @FXML
    private Button home;
    @FXML
    private Button journal;
    @FXML
    private Button note;
    @FXML
    private Label label;
    @FXML
    private AnchorPane mainpane;
    @FXML
    private Button logout;
    @FXML
    private AnchorPane notepane;
    @FXML
    private AnchorPane journalpane;
    @FXML
    private AnchorPane homepane;
    @FXML
    private AnchorPane todopane;
    @FXML
    private Button todo;
    @FXML
    private Button addTodoBtn;
    @FXML
    private Button addNoteBtn;
    @FXML
    private Button addJournalBtn;
    @FXML
    protected static GridPane gridJournal;
    @FXML
    protected static GridPane gridTodo;
    @FXML
    protected static GridPane gridNote;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }

    @FXML
    private void logout(javafx.event.ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("login.fxml"));
        
        Scene scene = new Scene(parent, logout.getScene().getWidth(), logout.getScene().getHeight());
        
        Stage stage = (Stage) logout.getScene().getWindow();
        stage.setScene(scene);
    }
    
    @FXML
    private void homeBtn(javafx.event.ActionEvent event) throws IOException {
        homepane.toFront();
        home.setEffect(new InnerShadow());
        journal.setEffect(null);
        todo.setEffect(null);
        note.setEffect(null);
    }
    
    @FXML
    private void journalBtn(javafx.event.ActionEvent event) throws IOException {
        journalpane.toFront();
        journal.setEffect(new InnerShadow());
        home.setEffect(null);
        todo.setEffect(null);
        note.setEffect(null);
    }
    
    @FXML
    private void diaryBtn(javafx.event.ActionEvent event) throws IOException {
        todopane.toFront();
        todo.setEffect(new InnerShadow());
        journal.setEffect(null);
        home.setEffect(null);
        note.setEffect(null);
    }
    
    @FXML
    private void noteBtn(javafx.event.ActionEvent event) throws IOException {
        notepane.toFront();
        note.setEffect(new InnerShadow());
        journal.setEffect(null);
        todo.setEffect(null);
        home.setEffect(null);
    }
    
    @FXML
    private void addJournal(javafx.event.ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("journalnew.fxml"));
        
        Scene scene = new Scene(parent);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void addNote(javafx.event.ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("notenew.fxml"));
        
        Scene scene = new Scene(parent);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void addTodo(javafx.event.ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("todonew.fxml"));
        
        Scene scene = new Scene(parent);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}