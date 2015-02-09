package controllers;

import java.util.List;

import models.User;
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
    	return TODO;
    }    
    
    public static Result readUsers() {
    	List<User> users = User.find.all();
    	return ok(Json.toJson(users));
    }
    
    public static Result updateUser(User user) {
    	user.save();
    	return TODO;
    }
    
    public static Result deleteUser(User user) {
    	user.delete();
    	return TODO;    	
    }
}
