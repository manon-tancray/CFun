package com.manon.testprojet_cfun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController {

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
    private ComboBox<?> status;

    @FXML
    private TextField txt_login;



Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;

public void ShowClientInterface () {
  login.setVisible(false);
  choix.setVisible(true);
}

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

}