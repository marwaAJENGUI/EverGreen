/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import connexion.MyConnexion;
import entity.Evenements;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;

/**
 *
 * @author admin
 */
public class EvenementsService {
      Connection cn = MyConnexion.getInstance().getConnection();
    MyConnexion cnx = MyConnexion.getInstance();
    public  void ajouterAlaBase(Evenements e) {
         try {
           
             
              Date Date_E = Calendar.getInstance().getTime();
           //  SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMMM yyyy, hh:mm:ss.SSS a");  
             SimpleDateFormat format1 = new SimpleDateFormat("yyyy-mm-dd"); 
             
            //  String s = d.
             String req = "INSERT INTO `events`(`id`, `Name_E`,  `Description`,  `Date_E`, `Lieu_E`) VALUES (?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(req);
              pstm.setInt(1, e.getId());
             pstm.setString(2, e.getName_E());
             pstm.setString(3, e.getDescription());
             pstm.setDate(4, (java.sql.Date) e.getDate_E());
             pstm.setString(5, e.getLieu_E());
            
             pstm.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(EvenementsService.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
           public void deleteEvenements(Evenements events) throws SQLException{
        String req="DELETE FROM evenements WHERE id=?";
        PreparedStatement ste = cn.prepareStatement(req);
        ste.setInt(1, events.getId());
        ste.executeUpdate();
    }
           public void deleteEven(String Name_E) {
try {
     PreparedStatement stm = cn.prepareStatement("delete from evenements where Name_E=?");
    stm.setString(1, Name_E);
    int i = stm.executeUpdate();
    if (i != 0) {
        System.out.println("deleted");
    } else {
        System.out.println("not deleted");
    }
} catch (SQLException e) {
     Logger.getLogger(EvenementsService.class.getName()).log(Level.SEVERE, null, e);
}
}
              public void updateEvents(int id,String Name_E,String Description,Date Date_E,String Lieu_E) {

         try {       
           String req = "UPDATE `events`SET `Name_E`=?,`Description`=?,`Date_E`=?,`Lieu_E`=?, WHERE `id`=?";
           PreparedStatement stm = cn.prepareStatement(req);
            stm.setInt(5, id);
            stm.setString(1, Name_E);
            stm.setString(2, Description);
            stm.setDate(3, (java.sql.Date) Date_E);
            stm.setString(4, Lieu_E);
            stm.executeUpdate();
        } catch (SQLException e) {
             Logger.getLogger(EvenementsService.class.getName()).log(Level.SEVERE, null, e);
        }    
        }
                 public List<Evenements> readALL() throws SQLException { //en relation avec la fonction inviter des amis
      List<Evenements> event = new ArrayList<>();
        try {
            String req = "select * FROM `events`";
            Statement stm = cn.createStatement();
        
        ResultSet resultat = stm.executeQuery(req);
        while(resultat.next()){
           int id= resultat.getInt(1);
           String Name_E = resultat.getString("Name_E");
           String Description = resultat.getString("Description");
           Date Date_E= resultat.getDate("Date_E");
           String Lieu_E = resultat.getString("Lieu_E");
           event.add(new Evenements(id, Name_E, Description, (java.sql.Date) Date_E, Lieu_E));
        
           
            
        }} catch (SQLException e) {
            Logger.getLogger(EvenementsService.class.getName()).log(Level.SEVERE, null, e);
        }
        return event;
    }/*
         public Evenements findbyid(Integer id) {
         Evenements e=new Evenements();
        
         try {
           
            String req="Select * from evenements where id=?";
            PreparedStatement stm = cn.prepareStatement(req);
            stm.setInt(1, id);
            ResultSet rs =stm.executeQuery();
             while (rs.next()) {
                 e.setId(id);
                 e.setNom(rs.getString("nom"));
                 e.setDate(rs.getDate("date"));
                 e.setDescription(rs.getString("description"));

             }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EvenementsService.class.getName()).log(Level.SEVERE, null, ex);
        }
      return e;
    }
                             public Evenements findbyname(String  nom) {
        Evenements e=new Evenements();
        try {
           
            String req="Select * from evenements where nom=?";
            PreparedStatement stm = cn.prepareStatement(req);
            stm.setString(1, nom);
            ResultSet rs =stm.executeQuery();
             while (rs.next()) {
                 e.setId(rs.getInt("id"));
                 e.setNom(rs.getString("nom"));
                 e.setDate(rs.getDate("date"));
                 e.setDescription(rs.getString("description"));
             
             }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EvenementsService.class.getName()).log(Level.SEVERE, null, ex);
        }
      return e;

    }*/

    public void insert(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insert(Evenements e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
         
}

