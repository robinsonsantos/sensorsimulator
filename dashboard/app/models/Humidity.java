package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Humidity extends Model {
	
	@Id
	@GeneratedValue
	public Long id;
	public Integer value;
}
