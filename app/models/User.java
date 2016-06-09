package models;

import java.util.*;

import javax.persistence.*;

import play.db.jpa.*;
 
@Entity
public class User extends Model {
 
    public String email;
    public String password;
    public String fullname;
    public boolean isAdmin;
    
    @OneToMany
    public List<Horse_Owner> horses;
    
    public User(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }
    
    public void addHorses()
    {
    	horses.add(new Horse_Owner(this , "Badgers Drift" , 0.5)) ;
    	horses.add(new Horse_Owner(this , "Horse Chestnut" , 0.5)) ;
    	
    }
    
    
    public static boolean authenticate(String user_name, String password)

	{
		boolean isAuthenticated = false;
		
		if (user_name.equals("mark")  && password.equals("mark33"))
			isAuthenticated = true;
		else isAuthenticated = false;
		
		return isAuthenticated;
	}
    
 
}
