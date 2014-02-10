package be.nmine.sweetycup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import be.nmine.sweetycup.domain.Comment;

@Repository
public class CommentDaoImpl implements CommentDao {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	
	@Override
	@Transactional(readOnly=false)
	public void save(Comment comment) {
		entityManager.persist(comment);
	}


	@Override
	@Transactional
	public List<Comment> findComments() {
		return entityManager.createQuery("FROM Comment", Comment.class).getResultList();
	}

}
