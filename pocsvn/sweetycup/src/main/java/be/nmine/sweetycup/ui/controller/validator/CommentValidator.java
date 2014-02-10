package be.nmine.sweetycup.ui.controller.validator;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import be.nmine.sweetycup.domain.Comment;

	

	public class CommentValidator implements Validator {
	    public boolean supports(Class<?> clazz) {
	        return Comment.class.isAssignableFrom(clazz);
	    }
	 
	    public void validate(Object target, Errors errors) {
//	    	GoodModel model = (GoodModel) target;
//	    	System.out.println("Handler by validator... ");
//	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "content", "views.good.description.error");
	    }
	}
