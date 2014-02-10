package be.nmine.sweetycup.dao;

import java.util.List;

import be.nmine.sweetycup.domain.Comment;

public interface CommentDao {

	void save(Comment comment);

	List<Comment> findComments();

}
