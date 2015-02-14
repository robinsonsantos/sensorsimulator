package controllers;

import java.util.List;

import models.Record;

import play.libs.Json;
import play.mvc.*;
import views.html.*;
import play.data.Form;


public class Records extends Controller {

    public static Result save() {
        Record record = Json.fromJson(request().body().asJson(), Record.class);
        record.save();
        return ok();
    }

    public static Result list() {
        List<Record> records = Record.find.all();
        return ok(Json.toJson(records));
    }
}
