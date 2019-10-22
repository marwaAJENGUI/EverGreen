/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class MyConnexion {
    static MyConnexion instance;
    public Connection cnx;

    public static MyConnexion getInstance() {
        if (instance == null) {
            instance = new MyConnexion();
        }

        return instance;
    }

    private MyConnexion() 
    {
        try
        {
            String url = "jdbc:mysql://localhost/pepiniere";
            String login = "root";
            String pwd = "";
            cnx = DriverManager.getConnection(url, login, pwd);

            System.out.println("Connexion établie");
        } 
        catch (SQLException ex) 
        {
            System.err.println(ex.getMessage());
        }
    }

    public Connection getConnection()
    {
        return cnx;
    }

   public Statement createStatement() {
        return null;
    }

}


