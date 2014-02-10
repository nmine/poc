package be.nmine.client.ui.impl;

import be.nmine.client.place.HeaderPlace;
import be.nmine.client.place.RightContentPlace;
import be.nmine.client.ui.HeaderView;
import be.nmine.client.ui.HeaderView.Presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class HeaderViewImpl extends Composite implements HeaderView {

    interface HeaderViewImplUiBinder extends UiBinder<Widget, HeaderViewImpl> {
    }

    private static HeaderViewImplUiBinder uiBinder = GWT.create(HeaderViewImplUiBinder.class);

    private Presenter presenter;
    
    @UiField
    Button changeActivityButton;

    public interface ViewUiBinder extends UiBinder<HTMLPanel, HeaderViewImpl> {
    }

    public HeaderViewImpl() {
    	initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(Presenter presenter) {
    	this.presenter = presenter;
    }

    @Override
    public Presenter getPresenter() {
    	return presenter;
    }

    @Override
    public void setWidget(IsWidget w) {
    	// TODO Auto-generated method stub

    }
    
    @UiHandler("changeActivityButton")
    void onClickTestButton(ClickEvent event) {
    	presenter.goTo(new RightContentPlace("m"));
    }
}
