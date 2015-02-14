package controllers;

import play.mvc.*;
import views.html.Graphics.*;

public class Graphics extends Controller {

    public static Result show() {
        return ok(show.render());
    }
}
