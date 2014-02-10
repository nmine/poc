package be.nmine.client;

import be.nmine.client.mvp.AppPlaceHistoryMapper;
import be.nmine.client.mvp.ContentActivityMapper;
import be.nmine.client.place.HeaderPlace;
import be.nmine.client.place.LeftContentPlace;
import be.nmine.client.place.RightContentPlace;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.storage.client.Storage;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PocGWT implements EntryPoint {
    private static final int ACTIVITY_NUMBER = 4;
	private final Place defaultPlace = new RightContentPlace("World!");
    private final SimplePanel appWidget = new SimplePanel();

    @Override
    public void onModuleLoad() {
		// // Create ClientFactory using deferred binding so we can replace with different
		// // impls in gwt.xml
		// ClientFactory clientFactory = GWT.create(ClientFactory.class);
		// EventBus eventBus = clientFactory.getEventBus();
		// PlaceController placeController = clientFactory.getPlaceController();
		//
		// // Start ActivityManager for the main widget with our ActivityMapper
		// ActivityMapper activityMapper = new ContentActivityMapper(clientFactory);
		// ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		// activityManager.setDisplay(appWidget);
		//
		// // Start PlaceHistoryHandler with our PlaceHistoryMapper
		// AppPlaceHistoryMapper historyMapper= GWT.create(AppPlaceHistoryMapper.class);
		// PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		// historyHandler.register(placeController, eventBus, defaultPlace);
		//
		// RootPanel.get().add(appWidget);
		// // Goes to place represented on URL or default place
		// historyHandler.handleCurrentHistory();
		// Create ClientFactory using deferred binding so we can replace with different
		// impls in gwt.xml
		ClientFactory clientFactory = GWT.create(ClientFactory.class);
		EventBus eventBus = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();
		clientFactory.getMainView().getHeader().setWidget(clientFactory.getHeaderView());
		clientFactory.getMainView().getLeftContent().setWidget(clientFactory.getLeftContentView());
		clientFactory.getMainView().getRightContent().setWidget(clientFactory.getRightContentView());
		clientFactory.getMainView().getFooter().setWidget(clientFactory.getFooterView());
		// Start ActivityManager for the main widget with our ActivityMapper
		ActivityMapper activityMapper = new ContentActivityMapper(clientFactory);
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
//		ActivityMapper headerActivityMapper = new ContentActivityMapper(clientFactory);
//		ActivityManager activityManagerHeader = new ActivityManager(headerActivityMapper, eventBus);
		activityManager.setDisplay(clientFactory.getLeftContentView());
//		activityManagerHeader.setDisplay(clientFactory.getHeaderView());
		// Start PlaceHistoryHandler with our PlaceHistoryMapper
		AppPlaceHistoryMapper historyMapper = GWT.create(AppPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		RootPanel.get().add(clientFactory.getMainView().asWidget());
//		historyHandler.register(placeController, eventBus, new HeaderPlace("toto"));
//		historyHandler.register(placeController, eventBus, new RightContentPlace("toto"));
		historyHandler.register(placeController, eventBus, new LeftContentPlace("toto"));
//		historyHandler.register(placeController, eventBus, new HeaderPlace("toto"));
		// Goes to place represented on URL or default place
		historyHandler.handleCurrentHistory();
		storeTestDatainLocalStorage(5);
    }

	private void storeTestDatainLocalStorage(int lenghtData) {
		Storage storage = Storage.getLocalStorageIfSupported();
		if (storage != null) {
			for(int i = 0; i < lenghtData; i++) {
				storage.setItem("title."+i, "content"+i);
			}
		}
		
	}
}
