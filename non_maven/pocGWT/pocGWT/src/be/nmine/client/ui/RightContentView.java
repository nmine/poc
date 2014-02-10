package be.nmine.client.ui;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public interface RightContentView extends IsWidget, AcceptsOneWidget {
    void setName(String helloName);

    void setPresenter(Presenter listener);

    public interface Presenter {
    	void goTo(Place place);
    }
}