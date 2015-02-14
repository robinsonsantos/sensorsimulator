package controllers;

import java.util.List;

import play.libs.Json;
import play.mvc.*;
import views.html.*;
import play.data.Form;


public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }    
}
