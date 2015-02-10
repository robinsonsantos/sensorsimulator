package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.ebean.*;

@Entity
public class Device extends Model {

    @Id
    @GeneratedValue
    public Long id;
    public String uuid;
    public String name;
    public String valueType;

    public static Model.Finder<Long, Device> find =
                    new Model.Finder<Long, Device>(Long.class, Device.class);        
}
