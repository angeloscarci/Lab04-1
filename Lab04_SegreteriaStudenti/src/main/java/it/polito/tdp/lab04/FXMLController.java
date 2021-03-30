package it.polito.tdp.lab04;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.lab04.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Model model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> tendinaCorso;

    @FXML
    private TextField matricola;

    @FXML
    private TextField nome;

    @FXML
    private TextField cognome;

    @FXML
    private TextArea output;

    @FXML
    void doCercaCorsi(ActionEvent event) {

    }

    @FXML
    void doCercaIscritti(ActionEvent event) {

    }

    @FXML
    void doIscrivi(ActionEvent event) {

    }

    @FXML
    void doReset(ActionEvent event) {

    }
    
    public void setModel(Model model) {
    	this.model = model;
    }

    @FXML
    void initialize() {
        assert tendinaCorso != null : "fx:id=\"tendinaCorso\" was not injected: check your FXML file 'Scene.fxml'.";
        assert matricola != null : "fx:id=\"matricola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert nome != null : "fx:id=\"nome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert cognome != null : "fx:id=\"cognome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert output != null : "fx:id=\"output\" was not injected: check your FXML file 'Scene.fxml'.";
        nome.setDisable(true);
        cognome.setDisable(true);
        for(String s: model.getListaCorsi())
        tendinaCorso.getItems().add(s);

    }
}
