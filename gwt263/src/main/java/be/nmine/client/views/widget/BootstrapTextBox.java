package be.nmine.client.views.widget;

import be.nmine.client.views.event.ChangeColorEvent;
import be.nmine.client.views.event.ChangeColorEventHandler;
import be.nmine.client.views.event.HasChangeColorEventHandlers;

import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.user.client.ui.TextBox;

public class BootstrapTextBox extends
		AbstractBootstrapValueBox<TextBox, String> implements HasKeyUpHandlers,
		HasChangeColorEventHandlers {

	private EventBus eventBus;
	
	


	@UiConstructor
	public BootstrapTextBox(String label) {
		super(new TextBox(), label);
		getValuebox().addKeyDownHandler(new KeyDownHandler() {

			@Override
			public void onKeyDown(KeyDownEvent event) {
				// Ignore return presses - workaround for Google Chrome
				// very first time you are in a textbox and press enter, it
				// refreshes the page.
				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
					event.preventDefault();
				}
			}
		});
	}


	@Override
	public String getValue() {
		return super.getValue() != null && super.getValue().trim().length() > 0 ? super
				.getValue().trim() : null;
	}

	public EventBus getEventBus() {
		return eventBus;
	}


	public void updateMask(String mask) {
		setMask(mask);
		addMask(getValuebox().getElement(), mask, maskReverse);

	}

	@Override
	public HandlerRegistration addKeyUpHandler(KeyUpHandler handler) {
		return valuebox.addKeyUpHandler(handler);
	}

	@Override
	public HandlerRegistration addHasChangeColorEventHandler(
			ChangeColorEventHandler handler) {
		return addHandler(handler, ChangeColorEvent.getType());
	}
	
	public void setEventBus(EventBus eventBus) {
		this.eventBus = eventBus;
	}
}
