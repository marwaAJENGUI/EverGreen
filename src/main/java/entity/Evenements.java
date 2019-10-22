/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;
import java.util.Objects;



/**
 *
 * @author admin
 */
public class Evenements {
    
    private int id;
    private String Name_E;
    private String Description;
    private Date Date_E;
    private String Lieu_E;

    public Evenements() {
    }

    public Evenements(String Name_E, String Description, Date Date_E, String Lieu_E) {
        this.Name_E = Name_E;
        this.Description = Description;
        this.Date_E = Date_E;
        this.Lieu_E = Lieu_E;
    }

    public Evenements(int id, String Name_E, String Description, Date Date_E, String Lieu_E) {
        this.id = id;
        this.Name_E = Name_E;
        this.Description = Description;
        this.Date_E = Date_E;
        this.Lieu_E = Lieu_E;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_E() {
        return Name_E;
    }

    public void setName_E(String Name_E) {
        this.Name_E = Name_E;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getDate_E() {
        return Date_E;
    }

    public void setDate_E(Date Date_E) {
        this.Date_E = Date_E;
    }

    public String getLieu_E() {
        return Lieu_E;
    }

    public void setLieu_E(String Lieu_E) {
        this.Lieu_E = Lieu_E;
    }

    @Override
    public String toString() {
        return "Evenements{" + "id=" + id + ", Name_E=" + Name_E + ", Description=" + Description + ", Date_E=" + Date_E + ", Lieu_E=" + Lieu_E + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evenements other = (Evenements) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.Name_E, other.Name_E)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.Lieu_E, other.Lieu_E)) {
            return false;
        }
        if (!Objects.equals(this.Date_E, other.Date_E)) {
            return false;
        }
        return true;
    }

   
    
}

    