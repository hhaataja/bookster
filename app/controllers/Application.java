package controllers;


import java.util.List;

import models.Book;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Hello World!"));
  }
  
  public static Result addBook(){
	  Form<Book> book = form(Book.class).bindFromRequest();
	  book.get().save();
      return redirect(routes.Application.index());
  }
  
  
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static Result getBooks(){
  	List<Book> books = new Model.Finder(String.class, Book.class).all();  	
  	return ok(play.libs.Json.toJson(books));
  }
  
}