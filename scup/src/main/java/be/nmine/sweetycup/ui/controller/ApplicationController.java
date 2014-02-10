package be.nmine.sweetycup.ui.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.nmine.sweetycup.domain.Article;
import be.nmine.sweetycup.service.ArticleService;
import be.nmine.sweetycup.ui.controller.model.SearchModel;

@Controller
@RequestMapping("/articles")
public class ApplicationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);
	
	@Inject
	private ArticleService articleService;
	
	// http://localhost:7080/mysample/articles
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model, SearchModel searchModel) {
	    List<Article> articles = articleService.findArticles();
	    model.addAttribute("articles", articles);
	    return "articles/index";
	}
}
