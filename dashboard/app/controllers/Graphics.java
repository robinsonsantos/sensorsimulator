package controllers;

import play.mvc.*;
import views.html.graphics_.*;

public class Graphics extends Controller {

    public static Result index() {
        return ok(index.render());
    }
}
