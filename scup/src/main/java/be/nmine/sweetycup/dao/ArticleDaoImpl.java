package be.nmine.sweetycup.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import be.nmine.sweetycup.domain.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	private Integer idSequence = 0;
	private Map<Integer, Article> goods = new HashMap<Integer, Article>();
	public static final int TEMPLATE_MAIN = 0;

    public static final int TEMPLATE_LEFT_SIDE = 2;
	
	@Override
	public void save(Article article) {
//		article.setId(++idSequence);
//		goods.put(article.getId(), article);
		
//		return article;
	}

	@Override
	public List<Article> findByTitle(String title) {
		return entityManager.createQuery("SELECT a FROM Article a WHERE a.title = '"+title+"'" , Article.class).getResultList();
	}


	@Override
	public List<Article> findArticles() {
		return entityManager.createQuery("FROM Article", Article.class).getResultList();
	}

}
