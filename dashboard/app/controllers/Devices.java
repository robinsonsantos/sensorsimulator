package controllers;

import java.util.List;
import java.util.UUID;

import models.Device;

import play.libs.Json;
import play.mvc.*;
import views.html.Devices.*;
import play.data.Form;


public class Devices extends Controller {

    public static Result show() {
        return ok(show.render());
    }
    
    public static Result save() {
        //Device device = Json.fromJson(request().body().asJson(), Device.class);
        Device device = Form.form(Device.class).bindFromRequest().get(); 
        //device.setUuid(UUID.randomUUID().toString());
    	device.save();
    	//return ok("Success");
        return redirect(routes.Application.index());
    }

    public static Result list() {
    	List<Device> devices = Device.find.all();
    	return ok(Json.toJson(devices));
    }
}
