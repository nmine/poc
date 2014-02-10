package be.nmine.client.views.selectors;

import com.google.gwt.query.client.GQuery;
import com.google.gwt.query.client.Selector;
import com.google.gwt.query.client.Selectors;

	public interface GlobalSelectors extends Selectors {
		@Selector("input")
		GQuery getAllInputElements();
	}
