package com.manon.testprojet_cfun;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.Scene;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.util.Currency;
import java.util.ResourceBundle;

/*element fxml*/
/**
 * @author manon
 *
 */
public class GestionnaireController{
	
/*	 @FXML
	    private AnchorPane Gestionnaire;

	    @FXML
	    private TableColumn<String, String> ID;

	    @FXML
	    private TableColumn<String, String> MDP;

	    @FXML
	    private AnchorPane Menu;

	    @FXML
	    private TableColumn<String, String> NAME;

	    @FXML
	    private TableColumn<String, String> STATUS;

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
	    private ObservableList<String> data;
	    
	    @FXML
	    private TableView<String> table_ticket;
	    
*/
		@FXML
	  	private ObservableList<ObservableList> data;
		@FXML
	    private TableView tableview;

	   
		
	    
	/**
	 * 
	 */
		
	/*connection bdd*/
	/*@FXML
	public void buildData() {
		 conn = SQLConnection.ConnectDb();
		
		 
		 try{
			 String sql = "Select * From USER";
			 ResultSet rs = conn.createStatement().executeQuery(sql);
			 
			 for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
		         final int j = i;
		         TableColumn<Object, String> col = new TableColumn<(rs.getMetaData().getColumnName(i+1)), String >;
		         col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
		             public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
		                 return new SimpleStringProperty(param.getValue().get(j).toString());                        
		             }                    
		         });

		         table_ticket.getColumns().add(col); 
		         System.out.println("Column ["+i+"] ");
		     }
			 while(rs.next()){
	                //Iterate Row
	                ObservableList<String> row = FXCollections.observableArrayList();
	                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
	                    //Iterate Column
	                    row.add(rs.getString(i));
	                }
	                System.out.println("Row [1] added "+row );
	                data.addAll(row);

	            }

	           
			 table_ticket.setItems(data);
			
		 }
		catch (Exception e) {
			System.out.println(e);
		}		
	}*/
}
