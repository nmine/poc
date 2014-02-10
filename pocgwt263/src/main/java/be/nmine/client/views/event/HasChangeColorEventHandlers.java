package be.nmine.client.views.event;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

public interface HasChangeColorEventHandlers extends HasHandlers {
	public HandlerRegistration addHasChangeColorEventHandler(
			ChangeColorEventHandler handler);
}