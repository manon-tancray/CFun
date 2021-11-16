package com.manon.testprojet_cfun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class GestionnaireController {
	
	 @FXML
	    private AnchorPane Gestionnaire;

	    @FXML
	    private TableColumn<?, ?> ID;

	    @FXML
	    private TableColumn<?, ?> MDP;

	    @FXML
	    private AnchorPane Menu;

	    @FXML
	    private TableColumn<?, ?> NAME;

	    @FXML
	    private TableColumn<?, ?> STATUS;

	    @FXML
	    private Button button_deconnexion;

	    @FXML
	    private Button button_gestion_tickets;

	    @FXML
	    private Button button_inscription;

	    @FXML
	    private AnchorPane gestion_tickets;

	    @FXML
	    private AnchorPane inscription;

	    @FXML
	    private TableView<?> table_ticket;

	    private ObservableList<ObservableList> data;

	    
	/**
	 * 
	 */
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pst = null;

}
