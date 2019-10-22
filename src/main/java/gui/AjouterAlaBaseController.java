/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entity.Evenements;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import service.EvenementsService;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class AjouterAlaBaseController implements Initializable {
    
     @FXML
    private TextField tfName;
    @FXML
    private TextField tfDescription;
    @FXML
    private DatePicker tfDate;
    @FXML
    private TextField tfLieu;
    @FXML
    private Button btnadd;
    @FXML
    private ImageView add_img_view;
    Date dateFinal;
  
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        btnadd.setOnAction(x->{
        DateFormat df = new SimpleDateFormat("yyyy-MM-DD");
        LocalDate locald = tfDate.getValue();
        Date date = Date.valueOf(locald);
        String datee = df.format(date);
        
        
         java.util.Date parsed;
            try {
                parsed = df.parse(datee);
                 dateFinal  = new java.sql.Date(parsed.getTime()) ;
            } catch (ParseException ex) {
                Logger.getLogger(AjouterAlaBaseController.class.getName()).log(Level.SEVERE, null, ex);
            }
       

        Evenements e=new Evenements(tfName.getText(), tfDescription.getText(), dateFinal, tfLieu.getText());
        EvenementsService ps=new EvenementsService();
        ps.ajouterAlaBase(e);
        
        Parent root;
            try {
                root=FXMLLoader.load(getClass().getResource("../fxml/affiche_Events.fxml"));
                btnadd.getScene().setRoot(root);
                        } catch (IOException ex) {
                Logger.getLogger(AjouterAlaBaseController.class.getName()).log(Level.SEVERE, null, ex);
            }
    });
       
    }
        
}
