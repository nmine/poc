package be.nmine.client.ui;

import be.nmine.client.place.HeaderPlace;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

/**
 * 
 * @author nmine
 * 
 */
public interface HeaderView extends IsWidget ,AcceptsOneWidget{

    public void setPresenter(Presenter presenter);

    public Presenter getPresenter();

    public interface Presenter {

		void goTo(Place place);

    }

}
