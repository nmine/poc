package be.nmine.client.ui;

import java.util.List;

import be.nmine.shared.Topic;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public interface LeftContentView extends IsWidget, AcceptsOneWidget {
    void setName(String helloName);

    void setPresenter(Presenter listener);

    public interface Presenter {
    	void goTo(Place place);

		void loadDataFromLocalStorage();
    }

	void fillTopicGrid(List<Topic> topics);
}