package be.nmine.sweetycup.ui.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.ServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;

import net.tanesha.recaptcha.ReCaptcha;
import net.tanesha.recaptcha.ReCaptchaResponse;

import org.hibernate.validator.method.MethodConstraintViolation;
import org.hibernate.validator.method.MethodConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import be.nmine.sweetycup.constraints.ProductId;
import be.nmine.sweetycup.domain.Article;
import be.nmine.sweetycup.domain.Comment;
import be.nmine.sweetycup.domain.MailMessage;
import be.nmine.sweetycup.exception.MyServiceException;
import be.nmine.sweetycup.service.ArticleService;
import be.nmine.sweetycup.service.CommentService;
import be.nmine.sweetycup.service.MailService;
import be.nmine.sweetycup.utils.DAOUtil;

@Controller
@RequestMapping("/articles")
public class ApplicationController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ApplicationController.class);

	@Inject
	private ArticleService articleService;

	@Inject
	private CommentService commentService;

	@Inject
	private MailService mailService;

	@Inject
	private ReCaptcha reCaptchaService;

	// http://localhost:8080/mysample/articles
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		// initData();
//		try {
			articleService.save(null, null);
			sendMessage(null,null,null, null, null, null);
			prepareModelForView(model, true, true);
			
//		} catch (MethodConstraintViolationException e) {
//    		Set<MethodConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
//    		LOGGER.info("Method Validation failed with {} error(s).", constraintViolations.size());
//    		
//    		for (MethodConstraintViolation<?> violation : e.getConstraintViolations()) {
//    			LOGGER.info("Method Validation: {}", violation.getConstraintDescriptor());
//    		}
//
//    	}
		return "articles/index";
	}

	
	



	// http://localhost:8080/mysample/articles
	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public String sendMessage(Model model, MailMessage mailMessage,BindingResult result,
			@RequestParam("recaptcha_challenge_field") String challangeField,
			@RequestParam("recaptcha_response_field") String responseField,
			ServletRequest servletRequest) {
		if (result.hasErrors()) {
			prepareModelForView(model, true, false);
			 model.addAttribute("locationFormMessage", Boolean.TRUE);
            return "articles/index";
		}
		ReCaptchaResponse reCaptchaResponse = this.reCaptchaService
				.checkAnswer(servletRequest.getRemoteAddr(), challangeField,
						responseField);
		if (reCaptchaResponse.isValid()) {
			mailService.send(mailMessage);
			prepareModelForView(model, true, true);
			model.addAttribute("successFormMailMessage",Boolean.TRUE);
			 model.addAttribute("locationFormMessage", Boolean.TRUE);
			return "articles/index";
		} else {
			prepareModelForView(model, true, false);
			model.addAttribute("mailMessage", mailMessage);
			model.addAttribute("captchaInvalid", true);
			 model.addAttribute("locationFormMessage", Boolean.TRUE);
			return "articles/index";
		}
	}

	// Submit on creation form
	@RequestMapping(method = RequestMethod.POST)
	public String  create(Model model, @ModelAttribute("comment") @Valid Comment comment,
			BindingResult result, final RedirectAttributes redirectAttributes,
			Locale locale) throws MyServiceException {
		if (result.hasErrors()) {
			prepareModelForView(model, false, true);
			model.addAttribute("locationFormComment", Boolean.TRUE);
            return "articles/index";
		}
		prepareModelForView(model, true, true);
        commentService.save(comment);
        model.addAttribute("successFormComment", Boolean.TRUE);
        model.addAttribute("locationFormComment", Boolean.TRUE);
        return "articles/index";
	}
	
//	 @ModelAttribute("comment")
//	 protected Comment comment() {
//		 Comment request = new Comment();
//		 return request;
//	 }

	@ExceptionHandler(MyServiceException.class)
	public ModelAndView handleException(Exception ex) {
	    LOGGER.error("log the error... ");
	    Map<String, Object> model = new HashMap<String, Object>();
	    
	    model.put("errorNumber", ex.getMessage());
		return new ModelAndView("error", model);
	}
	
//	@InitBinder({ "comment" })
//	protected void initBinder(WebDataBinder binder) {
//	    binder.setValidator(new CommentValidator());
//	}
	
	private void prepareModelForView(Model model, boolean addNewComment, boolean addNewMailMessage) {
		List<Article> articles = articleService.findArticles();
		List<Comment> comments = commentService.findComments();
		model.addAttribute("articles", articles);
		model.addAttribute("comments", comments);
		if(addNewComment)
			model.addAttribute("comment", new Comment());
		if(addNewMailMessage)
			model.addAttribute("mailMessage", new MailMessage());
	}

	private void initData() {
		for (Article article : DAOUtil.initData()) {
//			articleService.save(article);
		}

		for (Comment comment : DAOUtil.createComment()) {
			commentService.save(comment);
		}
	}
	
	@ExceptionHandler({Exception.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    protected ModelAndView handleException1(final Exception ex) {
        final ModelAndView mv = new ModelAndView();
        final List<String> messages = new ArrayList<String>();
        if (ex instanceof MethodConstraintViolationException) {
            for (ConstraintViolation failure : ((MethodConstraintViolationException) ex).getConstraintViolations()) {
                messages.add(failure.getMessage());
            }
        } else {
            messages.add(ex.getMessage());
        }
        mv.addObject("exceptionModel", messages);
        mv.setViewName("exception");
        return mv;
    }
}
