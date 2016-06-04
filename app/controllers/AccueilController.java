package controllers;

import play.mvc.*;
import models.User;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */.
public class AccueilController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>. test
     */



    public Result accueil(){

        User userObj = new User();
        userObj.nom = "azerty";
        userObj.prenom ="123";
        userObj.role = 1 ;
        userObj.identifiant = 7004568;
        userObj.email = "lbznoinzg@dfignp.com";
        userObj.save();




        String test = "";

        return ok(accueil.render(test));
    }

}


