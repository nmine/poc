package be.nmine.client.activity;

import be.nmine.client.ClientFactory;
import be.nmine.client.place.HeaderPlace;
import be.nmine.client.ui.HeaderView;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

/**
 * 
 * @author nmine
 * 
 */
public class HeaderActivity extends AbstractActivity implements HeaderView.Presenter {

    private HeaderView headerView;

    private final ClientFactory clientFactory;

    public HeaderActivity(HeaderPlace headerPlace, ClientFactory clientFactory) {
    	this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		headerView = clientFactory.getHeaderView();
		headerView.setPresenter(this);
		containerWidget.setWidget(headerView.asWidget());
		Window.alert("start header activity");
    }
    

	@Override
	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);
	}
	
	@Override
	public String mayStop() {
		return "The Header activity  is stopping.";
	}
}
