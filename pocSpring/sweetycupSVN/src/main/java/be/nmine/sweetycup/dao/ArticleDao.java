package be.nmine.sweetycup.dao;

import java.util.List;

import be.nmine.sweetycup.domain.Article;

public interface ArticleDao {

	void save(Article article);

	List<Article> findArticles();

	List<Article> findByTitle(String title);
	
}
