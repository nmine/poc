package be.nmine.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import be.nmine.client.ClientFactory;
import be.nmine.client.place.RightContentPlace;
import be.nmine.client.place.FooterPlace;
import be.nmine.client.ui.RightContentView;
import be.nmine.client.ui.FooterView;

public class FooterActivity extends AbstractActivity implements
		FooterView.Presenter {
	private ClientFactory clientFactory;

	public FooterActivity(FooterPlace place, ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	/**
	 * Invoked by the ActivityManager to start a new Activity
	 */
	@Override
	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		FooterView footerView = clientFactory.getFooterView();
		footerView.setPresenter(this);
		containerWidget.setWidget(footerView.asWidget());
		Window.alert("start Footer activity");
	}

	/**
	 * Ask user before stopping this activity
	 */
	@Override
	public String mayStop() {
		return "The Footer activity is stopping.";
	}

	/**
	 * Navigate to a new Place in the browser
	 */
	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);
	}
}
