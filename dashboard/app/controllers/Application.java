package controllers;

import java.util.List;

import org.h2.engine.Database;

import models.User;
import play.*;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result createUser() {
    	//User user = Json.fromJson(request().body().asJson(), User.class);    	
    	//user.save();
    	return ok("Success");
    }
    
    public static Result readUser(Long id) {    	
    	return TODO;
    }    
    
    public static Result readUsers() {
    	return TODO;
    }
    
    public static Result updateUser() {
    	return TODO;
    }
    
    public static Result deleteUser() {
    	return TODO;    	
    }
}
