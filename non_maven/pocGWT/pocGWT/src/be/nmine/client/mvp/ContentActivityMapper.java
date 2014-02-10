package be.nmine.client.mvp;

import be.nmine.client.ClientFactory;
import be.nmine.client.activity.FooterActivity;
import be.nmine.client.activity.HeaderActivity;
import be.nmine.client.activity.LeftContentActivity;
import be.nmine.client.activity.RightContentActivity;
import be.nmine.client.place.FooterPlace;
import be.nmine.client.place.HeaderPlace;
import be.nmine.client.place.LeftContentPlace;
import be.nmine.client.place.RightContentPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class ContentActivityMapper implements ActivityMapper {

    private final ClientFactory clientFactory;

    /**
     * AppActivityMapper associates each Place with its corresponding {@link Activity}
     * 
     * @param clientFactory
     *            Factory to be passed to activities
     */
    public ContentActivityMapper(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
    }

    /**
     * Map each Place to its corresponding Activity. This would be a great use for GIN.
     */
    @Override
    public Activity getActivity(Place place) {
		if (place instanceof RightContentPlace)
		    return new RightContentActivity((RightContentPlace) place, clientFactory);
		else if (place instanceof LeftContentPlace)
		    return new LeftContentActivity((LeftContentPlace) place, clientFactory);
		else if (place instanceof HeaderPlace)
		    return new HeaderActivity((HeaderPlace) place, clientFactory);
		else if (place instanceof FooterPlace)
		    return new FooterActivity((FooterPlace) place, clientFactory);
		return null;
    }

}
