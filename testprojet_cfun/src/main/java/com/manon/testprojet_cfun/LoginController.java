package com.manon.testprojet_cfun;

import java.net.URL;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ResourceBundle;
import javafx.fxml.Initializable;
/**
 * @author manon
 *
 */
public class LoginController implements Initializable{

	@FXML
    private AnchorPane billet_entree;

    @FXML
    private AnchorPane billet_sortie;

    @FXML
    private Button btn_login;

    @FXML
    private Button button_sortie;

    @FXML
    private Button button_sortie1;

    @FXML
    private AnchorPane choix;

    @FXML
    private AnchorPane login;

    @FXML
    private Button muscu;

    @FXML
    private ComboBox<String> status;

    @FXML
    private TextField txt_login;

    @FXML
    private PasswordField mdp;


Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;

public void ShowBillet () {
	billet_entree.setVisible(true);
	choix.setVisible(false);
}

public void ShowBilletSortie () {
	billet_entree.setVisible(false);
	billet_sortie.setVisible(true);
	choix.setVisible(false);
}

public void Deconnection () {
	choix.setVisible(false);
	login.setVisible(true);
}

public void Sortie() {
	billet_sortie.setVisible(false);
	choix.setVisible(true);
}


@FXML
private void Login (ActionEvent event) throws Exception {
	conn = SQLConnection.ConnectDb();
	String sql = "Select * From USER where NAME = ? and MDP = ? and SATUS = ?";
	
	try {
		pst = conn.prepareStatement(sql);
		pst.setString(1, txt_login.getText());
		pst.setString(2, mdp.getText());
		pst.setString(3, status.getValue().toString());
		rs = pst.executeQuery();
		if(rs.next()) {
			if (status.getValue().toString() == "Client") {
				JOptionPane.showMessageDialog(null, "Nom d'utilisateur et mot de passe correct");
				login.setVisible(false);
				choix.setVisible(true);
			}
			else {
				login.getScene().getWindow().hide();
				Parent root = FXMLLoader.load(getClass().getResource("gestionnaire.fxml"));
				Stage mainStage = new Stage();
				Scene scene = new Scene(root);
				mainStage.setScene(scene);
				mainStage.show();
			}
		}
		else 
			JOptionPane.showMessageDialog(null, "Nom d'utilisateur et mot de passe incorrect");
	}
	catch (Exception e) {
		System.out.println(e);
	}		
}

@FXML
private void Entree (ActionEvent event) throws Exception {
	conn = SQLConnection.ConnectDb();
	String sql = "insert From USER where NAME = ? and MDP = ? and SATUS = ?";
	
	
}

@Override
public void initialize (URL url, ResourceBundle rb) {
	status.getItems().addAll("Client","Gestionnaire");
}
}