package be.nmine.client.activity;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.storage.client.Storage;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import be.nmine.client.ClientFactory;
import be.nmine.client.place.LeftContentPlace;
import be.nmine.client.place.RightContentPlace;
import be.nmine.client.ui.LeftContentView;
import be.nmine.client.ui.RightContentView;
import be.nmine.shared.Topic;

public class LeftContentActivity extends AbstractActivity implements
		LeftContentView.Presenter {
	// Used to obtain views, eventBus, placeController
	// Alternatively, could be injected via GIN
	private ClientFactory clientFactory;
	// Name that will be appended to "Hello,"
	private String name;
	
	List<Topic> topics = new ArrayList<Topic>();
	
	private LeftContentView leftContentView; 

	public LeftContentActivity(LeftContentPlace place, ClientFactory clientFactory) {
		this.name = place.getHelloName();
		this.clientFactory = clientFactory;
	}

	/**
	 * Invoked by the ActivityManager to start a new Activity
	 */
	@Override
	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		leftContentView = clientFactory.getLeftContentView();
		leftContentView.setName(name);
		leftContentView.setPresenter(this);
		containerWidget.setWidget(leftContentView.asWidget());
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

	@Override
	public void loadDataFromLocalStorage() {
		Storage storage = Storage.getLocalStorageIfSupported();
		if (storage != null) {
			topics = new ArrayList<Topic>();
			for(int i = 0; i < storage.getLength(); i++) {
				topics.add(new Topic("title"+i, storage.getItem("title"+i)));
			}
		}
		leftContentView.fillTopicGrid(topics);
	}
}
