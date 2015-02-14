package controllers;

import java.util.List;

import models.User;

import play.libs.Json;
import play.mvc.*;
import views.html.*;
import play.data.Form;


public class Users extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result save() {
    	User user = Json.fromJson(request().body().asJson(), User.class);    	
    	user.save();
        return ok();
    	//return ok("Success");
        //return ok("{status: 200}").as("application/json");
    }
    
    public static Result show(Long id) {
    	User user = User.find.byId(id);
    	return ok(Json.toJson(user));
    }    
    
    public static Result list() {
    	List<User> users = User.find.all();
    	return ok(Json.toJson(users));
    }
    
    public static Result update(Long id) {
    	User updateUser = Json.fromJson(request().body().asJson(), User.class);  
    	User user = User.find.byId(id);
        //user.setName(updateUser.getName());
    	user.save();
    	return ok("Success");
    }
    
    public static Result delete(Long id) {
        User user = User.find.byId(id);
    	user.delete();
    	return ok("Success");    	
    }
}
