package be.nmine.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import be.nmine.client.ClientFactory;
import be.nmine.client.place.RightContentPlace;
import be.nmine.client.ui.RightContentView;

public class RightContentActivity extends AbstractActivity implements
		RightContentView.Presenter {
	// Used to obtain views, eventBus, placeController
	// Alternatively, could be injected via GIN
	private ClientFactory clientFactory;
	// Name that will be appended to "Hello,"
	private String name;

	public RightContentActivity(RightContentPlace place, ClientFactory clientFactory) {
		this.name = place.getHelloName();
		this.clientFactory = clientFactory;
	}

	/**
	 * Invoked by the ActivityManager to start a new Activity
	 */
	@Override
	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		RightContentView rightcontentView = clientFactory.getRightContentView();
		rightcontentView.setName(name);
		rightcontentView.setPresenter(this);
		containerWidget.setWidget(rightcontentView.asWidget());
		Window.alert("start Content activity");
	}

	/**
	 * Ask user before stopping this activity
	 */
	@Override
	public String mayStop() {
		return "The Content activity is stopping.";
	}

	/**
	 * Navigate to a new Place in the browser
	 */
	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);
	}
}
