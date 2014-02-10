package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Comments extends Model {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    private String author;

    @Column(length = 1000)
    private String content;

    public long getId() {
	return id;
    }

    public String getAuthor() {
	return author;
    }

    public String getContent() {
	return content;
    }

    public void setId(long id) {
	this.id = id;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

    public void setContent(String content) {
	this.content = content;
    }

}
