/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import entity.Evenements;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import service.EvenementsService;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class Affiche_EventsController implements Initializable {
    
    @FXML
    private TableView<Evenements> aff_view;
    @FXML
    private TableColumn<Evenements, String> colname;
    @FXML
    private TableColumn<Evenements, String> coldescription;
    @FXML
    private TableColumn<Evenements, Date> coldate;
    @FXML
    private TableColumn<Evenements, String> collieu;
    @FXML
    private TextField colname_U;
    @FXML
    private TextField coldescription_U;
    @FXML
    private TextField collieu_U;
    @FXML
    private DatePicker coldate_U;
    @FXML
    private Button btnupdate;
    @FXML
    private Button btndelete;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        EvenementsService ps=new EvenementsService();
        
        try {
            ArrayList<Evenements> pers=(ArrayList<Evenements>) ps.readALL();
            ObservableList<Evenements> obs=FXCollections.observableArrayList(pers);
            aff_view.setItems(obs);
            colname.setCellValueFactory(new PropertyValueFactory<>("Name_E") );
            coldescription.setCellValueFactory(new PropertyValueFactory<>("Description") );
            coldate.setCellValueFactory(new PropertyValueFactory<>("Date_E") );
            collieu.setCellValueFactory(new PropertyValueFactory<>("Lieu_E") );
        } catch (SQLException ex) {
            Logger.getLogger(Affiche_EventsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }    

    @FXML
    private void btnupdate(ActionEvent event) {
        
    }
    
}
