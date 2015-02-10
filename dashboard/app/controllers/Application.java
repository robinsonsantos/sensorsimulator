package controllers;

import java.util.List;

import models.User;
import models.Device;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result createUser() {
    	User user = Json.fromJson(request().body().asJson(), User.class);    	
    	user.save();
    	return ok("Success");
    }
    
    public static Result readUser(Long id) {
    	User user = User.find.byId(id);
    	return ok(Json.toJson(user));
    }    
    
    public static Result readUsers() {
    	List<User> users = User.find.all();
    	return ok(Json.toJson(users));
    }
    
    public static Result updateUser(Long id) {
    	User updateUser = Json.fromJson(request().body().asJson(), User.class);  
    	User user = User.find.byId(id);
        user.setName(updateUser.getName());
    	user.save();
    	return ok("Success");
    }
    
    public static Result deleteUser(Long id) {
        User user = User.find.byId(id);
    	user.delete();
    	return ok("Success");    	
    }

    public static Result createDevice() {
        Device device = Json.fromJson(request().body().asJson(), Device.class);
    	device.save();
    	return ok("Success");
    }
}
