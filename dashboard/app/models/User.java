package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class User extends Model {
	
	@Id
	@GeneratedValue
	public Long id;
	public String name;
	
	public static Model.Finder<Long, User> find = 
			new Model.Finder<Long, User>(Long.class, User.class);
}
