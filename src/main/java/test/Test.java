/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Evenements;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import service.EvenementsService;

/**
 *
 * @author admin
 */
public class Test {
public static void main(String[] args) throws ParseException, SQLException {
    String m = "2019-01-28";
    java.util.Date date =  new SimpleDateFormat("yyyy-MM-dd").parse(m);
    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    
    
    //Evenements ev1 =new Evenements("plants","gergez",sqlDate,"jrnjkgnng");
    //Evenements ev2 =new Evenements("plantsS","arffrafzra",sqlDate,"jrnjkgSDnng");
    //EvenementsService es=new EvenementsService();
    //es.ajouterAlaBase(ev1);
    //es.ajouterAlaBase(ev2);
    //es.deleteEvenements(ev1);
    //es.deleteEvenements(ev2);
    //es.deleteEven(ev1.getNom());
    //String m1 = "2020-01-28";
    //java.util.Date date1 =  new SimpleDateFormat("yyyy-MM-dd").parse(m1);
    //java.sql.Date sqlDate_E1 = new java.sql.Date(date1.getTime());
    //es.updateEvents(5, "anwer", sqlDate1, "alahalah");
    //System.out.println(es.readALL());
    //es.readALL().forEach(e->System.out.println(e));
   // System.out.println(es.findbyid(ev1.getId()));
}

}