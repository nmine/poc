package be.nmine.client;

import java.util.logging.Logger;

import be.nmine.client.views.TextBoxWidget;
import be.nmine.client.views.event.ChangeColorEvent;
import be.nmine.client.views.event.ChangeColorEventHandler;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class pocgwt263 implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";
	Logger logger = Logger.getLogger(this.getClass().getName());
	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	private final Messages messages = GWT.create(Messages.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		SimpleEventBus eventBus = new SimpleEventBus();
		TextBoxWidget textBoxWidget = new TextBoxWidget(eventBus);
		RootPanel.get().add(textBoxWidget);
		eventBus.addHandler(ChangeColorEvent.TYPE,
				new ChangeColorEventHandler() {

					@Override
					public void onChangeColor(ChangeColorEvent event) {
						logger.info(event.getColor() + " color of the event1");
					}
				});
	}
}
