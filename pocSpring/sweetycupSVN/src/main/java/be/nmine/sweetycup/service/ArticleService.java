package be.nmine.sweetycup.service;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import be.nmine.sweetycup.constraints.ProductId;
import be.nmine.sweetycup.domain.Article;
@Validated
public interface ArticleService {
	@NotNull(message="Null returns are not permitted") 
	void save(Article article,@NotNull String test);

	List<Article> findArticles();

	List<Article> findByTitle(String title);
}
