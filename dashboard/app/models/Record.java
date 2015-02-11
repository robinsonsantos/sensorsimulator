package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.ebean.*;

@Entity
public class Record extends Model {
	
	@Id
	@GeneratedValue
	public Long id;
	public String name;
	
	public static Model.Finder<Long, Record> find = 
			new Model.Finder<Long, Record>(Long.class, Record.class);
}
