package controllers;

import java.util.Set;

import com.avaje.ebean.Ebean;

import models.Article;
import models.Comments;
import play.api.templates.Html;
import play.data.Form;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
	
	private static final Form<Comments> commentForm = Form.form(Comments.class);

    public static Result index() {
    	return redirect(routes.Application.list(1));
    }

    @Transactional
    public static Result create() {
		Article.createItems();
		return redirect(routes.Application.list(1));
    }

    @Transactional
    public static Result list(Integer page) {
		Set<Article> articles = Article.find().findSet();
		Html renderedTemplate = views.html.articles.list.render(articles,commentForm);
		return ok(renderedTemplate);
    }
    
    @Transactional
    public static Result saveComments() {
    	Set<Article> articles = Article.find().findSet();
		Form<Comments> boundForm = commentForm.bindFromRequest();
		Comments comment = boundForm.get();
		if (boundForm.hasErrors()) {
		    flash("error", "Please correct the form below.");
		    return badRequest(views.html.articles.list.render(articles,commentForm));
		}
		Ebean.save(comment);
		flash("success", String.format("Successfully added product %s", comment));
		return redirect(routes.Application.list(1));
    }
}
