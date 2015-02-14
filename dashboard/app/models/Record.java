package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Record extends Model {
	
	@Id
	@GeneratedValue
	public Long id;
        public String uuid;
        public String value;
	public String createdAt;
	
	public static Model.Finder<Long, Record> find = 
			new Model.Finder<Long, Record>(Long.class, Record.class);
}
