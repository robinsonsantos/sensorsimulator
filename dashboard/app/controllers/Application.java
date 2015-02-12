package controllers;

import java.util.List;

import models.User;
import models.Record;

import play.libs.Json;
import play.mvc.*;
import views.html.*;
import play.data.Form;


public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result createUser() {
    	User user = Json.fromJson(request().body().asJson(), User.class);    	
    	user.save();
        return ok();
    	//return ok("Success");
        //return ok("{status: 200}").as("application/json");
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

    public static Result createRecord() {
        Record record = Json.fromJson(request().body().asJson(), Record.class);
        record.save();
        return ok();
    }

    public static Result readRecords() {
        List<Record> records = Record.find.all();
        return ok(Json.toJson(records));
    }
}
