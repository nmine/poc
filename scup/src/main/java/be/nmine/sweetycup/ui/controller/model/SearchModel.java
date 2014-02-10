package be.nmine.sweetycup.ui.controller.model;

import java.util.List;
import java.util.Locale;

import be.nmine.sweetycup.domain.Article;


public class SearchModel {

	private Locale locale;
	private List<Article> goods;
	private String description;

	public List<Article> getGoods() {
		return goods;
	}

	public void setGoods(List<Article> goods) {
		this.goods = goods;
	}

	public String setDescription() {
		return this.description;
	}

	public String getDescription() {
		return description;
	}
	
	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}
