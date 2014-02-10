package be.nmine.client.ui;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public interface MainView extends IsWidget {

    interface Presenter {
    }

    void setPresenter(Presenter presenter);

    public AcceptsOneWidget getHeader();

    public AcceptsOneWidget getLeftContent();
    
    public AcceptsOneWidget getRightContent();

    public AcceptsOneWidget getFooter();

}