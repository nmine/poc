package be.nmine.client.ui.impl;

import be.nmine.client.place.LeftContentPlace;
import be.nmine.client.ui.RightContentView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class RightContentViewImpl extends Composite implements RightContentView {
    private static RightContentImplUiBinder uiBinder = GWT.create(RightContentImplUiBinder.class);

    interface RightContentImplUiBinder extends UiBinder<Widget, RightContentViewImpl> {
    }

    @UiField
    Button changeActivityButton;
    
    private Presenter presenter;
    private String name;

    public RightContentViewImpl() {
    	initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setName(String name) {
		this.name = name;
    }

    @UiHandler("changeActivityButton")
    void onClickGoodbye(ClickEvent e) {
    	presenter.goTo(new LeftContentPlace(name));
    }

    @Override
    public void setPresenter(Presenter listener) {
    	this.presenter = listener;
    }

    @Override
    public void setWidget(IsWidget w) {

    }
}
