package be.nmine.sweetycup.domain;

import org.hibernate.validator.constraints.NotEmpty;

public class MailMessage {
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String content;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
