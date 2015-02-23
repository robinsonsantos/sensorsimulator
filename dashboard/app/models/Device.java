package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.data.validation.Constraints.Required;

@Entity
public class Device extends Model {

    @Id
    @GeneratedValue
    public Long id;
    @Required(message="Give us a UUID!")
    public String uuid;
    @Required(message="Give us a name!")
    public String name;
    @Required(message="Give us a Value Type!")
    public String valueType;

    public static Model.Finder<Long, Device> find =
                    new Model.Finder<Long, Device>(Long.class, Device.class);        
}
