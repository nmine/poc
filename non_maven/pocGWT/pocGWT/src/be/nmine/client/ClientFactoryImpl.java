package be.nmine.client;

import be.nmine.client.ui.FooterView;
import be.nmine.client.ui.HeaderView;
import be.nmine.client.ui.LeftContentView;
import be.nmine.client.ui.MainView;
import be.nmine.client.ui.RightContentView;
import be.nmine.client.ui.impl.FooterViewImpl;
import be.nmine.client.ui.impl.HeaderViewImpl;
import be.nmine.client.ui.impl.LeftContentViewImpl;
import be.nmine.client.ui.impl.MainViewImpl;
import be.nmine.client.ui.impl.RightContentViewImpl;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;

public class ClientFactoryImpl implements ClientFactory {
    private static final EventBus eventBus = new SimpleEventBus();
    private static final PlaceController placeController = new PlaceController(eventBus);
    private static final LeftContentView  leftContentView = new LeftContentViewImpl();
    private static final RightContentView  rightContentView = new RightContentViewImpl();
    private static final HeaderView headerView = new HeaderViewImpl();
    private static final FooterView footerView = new FooterViewImpl();
    private static final MainView mainView = new MainViewImpl();

    @Override
    public EventBus getEventBus() {
    	return eventBus;
    }

    @Override
    public RightContentView getRightContentView() {
    	return rightContentView;
    }
    
    @Override
    public LeftContentView getLeftContentView() {
    	return leftContentView;
    }

    @Override
    public PlaceController getPlaceController() {
    	return placeController;
    }

    @Override
    public HeaderView getHeaderView() {
    	return headerView;
    }

    @Override
    public MainView getMainView() {
    	return mainView;
    }

	@Override
	public FooterView getFooterView() {
		return footerView;
	}

}
