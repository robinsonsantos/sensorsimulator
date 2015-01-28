package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Temperature extends Model {
	
	@Id
	@GeneratedValue
	public Long id;
	public Float value;
}
