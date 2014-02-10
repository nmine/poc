package be.nmine.sweetycup.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.nmine.sweetycup.dao.CommentDao;
import be.nmine.sweetycup.domain.Comment;

@Service
public class CommentServiceImpl implements CommentService {

	@Inject
	private CommentDao commentDao;
	
	@Override
//	@Transactional(readOnly=false)
	public void save(Comment comment) {
		commentDao.save(comment);
	}

	@Override
//	@Transactional
	public List<Comment> findComments() {
		return commentDao.findComments();
	}

}
