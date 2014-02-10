package be.nmine.sweetycup.service;

import java.util.List;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import be.nmine.sweetycup.dao.ArticleDao;
import be.nmine.sweetycup.domain.Article;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Inject
	private ArticleDao articleDao;
	
	
	@Override
	public void save(Article article,String test) {
//		articleDao.save(article);
		System.out.println();
	}

	@Override
	public List<Article> findByTitle(String title) {
		return articleDao.findByTitle(title);
	}

	@Override
	public List<Article> findArticles() {
		return articleDao.findArticles();
	}

}
