package be.nmine.sweetycup.service;

import java.util.List;

import be.nmine.sweetycup.domain.Article;

public interface ArticleService {

	void save(Article article);

	List<Article> findArticles();

	List<Article> findByTitle(String title);
}
