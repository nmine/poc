package be.nmine.client;

import be.nmine.client.ui.FooterView;
import be.nmine.client.ui.HeaderView;
import be.nmine.client.ui.LeftContentView;
import be.nmine.client.ui.RightContentView;
import be.nmine.client.ui.MainView;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;

public interface ClientFactory {
    EventBus getEventBus();

    PlaceController getPlaceController();

    HeaderView getHeaderView();
    
    FooterView getFooterView();

    MainView getMainView();

	RightContentView getRightContentView();

	LeftContentView getLeftContentView();
}
