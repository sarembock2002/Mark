package models;

import java.util.List;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Horse extends Model {
 
    public String name;
    //public Trainer trainer;
    
    public Horse(String name) {
        this.name = name;
        //this.Tariner = trainer;
    }
 
}
