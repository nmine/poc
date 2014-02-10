package be.nmine.client.ui.impl;



import java.util.List;

import be.nmine.client.place.FooterPlace;
import be.nmine.client.place.HeaderPlace;
import be.nmine.client.ui.LeftContentView;
import be.nmine.client.ui.RightContentView;
import be.nmine.client.ui.RightContentView.Presenter;
import be.nmine.shared.Topic;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class LeftContentViewImpl extends Composite implements LeftContentView {
    private static final int COLUMN_NUMBERS = 2;

	private static LeftContentViewImplUiBinder uiBinder = GWT.create(LeftContentViewImplUiBinder.class);

    interface LeftContentViewImplUiBinder extends UiBinder<Widget, LeftContentViewImpl> {
    }

    @UiField
    Grid topicOverviews;
    
    @Override
    protected void onLoad() {
    	super.onLoad();
    }
    
    @UiField
    Button changeActivityButton;
    
    private Presenter presenter;
    private String name;

    public LeftContentViewImpl() {
    	initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setName(String name) {
		this.name = name;
    }

    @UiHandler("changeActivityButton")
    void onClickChangeActivityButton(ClickEvent e) {
    	presenter.loadDataFromLocalStorage();
    	presenter.goTo(new HeaderPlace(name));
    }

    @Override
    public void setPresenter(Presenter listener) {
    	this.presenter = listener;
    }
    
    @Override
    public void fillTopicGrid(List<Topic> topics) {
    	topicOverviews.resize(topics.size(), COLUMN_NUMBERS);
    	int i = 0;
    	for(Topic topic : topics) {
    		topicOverviews.insertRow(i);
    		topicOverviews.setWidget(i, 0, new Label(topic.getTitle()));
    		topicOverviews.setWidget(i, 1, new Label(topic.getContent()));
    	}
    }

    @Override
    public void setWidget(IsWidget w) {
	// TODO Auto-generated method stub

    }
}
