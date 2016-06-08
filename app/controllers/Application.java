package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import com.sun.net.httpserver.Authenticator.Result;

import models.*;


@With(Secure.class)
public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void mystable() {
        render();
    }
    
    public static void login() {
        render();
    }

}