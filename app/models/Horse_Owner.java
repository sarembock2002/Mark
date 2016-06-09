package models;

import java.util.List;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Horse_Owner extends Model {
 
    public String horse;
    public String owner;
    public double pct;
    //public Trainer trainer;
    
    public Horse_Owner(User user , String horse , double pct) 
    {
    	this.horse = horse;
    	this.owner = user.fullname;
    	this.pct = pct;
    }
 
}
