package be.nmine.sweetycup.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.nmine.sweetycup.dao.ArticleDao;
import be.nmine.sweetycup.domain.Article;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Inject
	private ArticleDao articleDao;
	
	
	@Override
	@Transactional(readOnly=false)
	public void save(Article article) {
		articleDao.save(article);
	}

	@Override
	@Transactional
	public List<Article> findByTitle(String title) {
		return articleDao.findByTitle(title);
	}

	@Override
	@Transactional
	public List<Article> findArticles() {
		return articleDao.findArticles();
	}

}
