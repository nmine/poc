package be.nmine.shared;

public class Topic {
	
	private String title;
	private String content;
	
	
	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Topic(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}


	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
