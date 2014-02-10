package be.nmine.client.views;

import java.util.logging.Level;
import java.util.logging.Logger;

import be.nmine.client.views.event.ChangeColorEvent;
import be.nmine.client.views.event.ChangeColorEventHandler;
import be.nmine.client.views.selectors.GlobalSelectors;
import be.nmine.client.views.widget.BootstrapTextBox;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.query.client.Function;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class TextBoxWidget extends Composite {

	@UiField
	HTMLPanel htmlPanelDepositInfo;
	@UiField
	BootstrapTextBox textBox1;
	@UiField
	BootstrapTextBox textBox2;
	@UiField
	BootstrapTextBox textBox3;
	@UiField
	BootstrapTextBox textBox4;
	@UiField
	BootstrapTextBox textBox5;

	Logger logger = Logger.getLogger(this.getClass().getName());

	public interface ViewUiBinder extends UiBinder<HTMLPanel, TextBoxWidget> {
	}

	private EventBus eventBus;
	
	ViewUiBinder uiBinder = GWT.create(ViewUiBinder.class);

	public TextBoxWidget(EventBus eventBus) {
		initWidget(uiBinder.createAndBindUi(this));
		this.eventBus = eventBus;
		textBox1.setEventBus(eventBus);
	}

	@Override
	protected void onLoad() {
		super.onLoad();
		GlobalSelectors s = GWT.create(GlobalSelectors.class);
		s.getAllInputElements().bind(Event.KEYEVENTS, new Function() {
			@Override
			public boolean f(Event e) {
				logger.log(Level.SEVERE,
						"on gesture target: " + e.getEventTarget());
				return true;
			}
		});
		textBox1.getEventBus().addHandler(ChangeColorEvent.TYPE, new ChangeColorEventHandler() {
			
			@Override
			public void onChangeColor(ChangeColorEvent event) {
				logger.info(event.getColor()+ " color of the event");
			}
		});
		eventBus.fireEvent(new ChangeColorEvent("blue"));
	}

	
}
