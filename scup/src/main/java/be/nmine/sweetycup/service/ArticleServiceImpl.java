package be.nmine.sweetycup.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import be.nmine.sweetycup.dao.ArticleDao;
import be.nmine.sweetycup.domain.Article;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Inject
	private ArticleDao articleDao;
	
	private Integer idSequence = 0;
	private Map<Integer, Article> goods = new HashMap<Integer, Article>();
	
	@Override
	public void save(Article article) {
		articleDao.save(article);
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
