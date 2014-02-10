package be.nmine.client.ui.impl;

import be.nmine.client.ui.MainView;
import be.nmine.client.ui.MainView.Presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class MainViewImpl extends Composite implements MainView {
    private static MainViewImplUiBinder uiBinder = GWT.create(MainViewImplUiBinder.class);

    public interface MainViewImplUiBinder extends UiBinder<Widget, MainViewImpl> {
    }

    private Presenter presenter;

    @UiField
    SimplePanel header;

    @UiField
    SimplePanel leftcontent;
    
    @UiField
    SimplePanel rightContent;

    @UiField
    SimplePanel footer;

    public MainViewImpl() {
    	initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(Presenter presenter) {
    	this.presenter = presenter;
    }

    @Override
    public AcceptsOneWidget getHeader() {
    	return header;
    }

    @Override
    public AcceptsOneWidget getLeftContent() {
    	return leftcontent;
    }
    
    @Override
    public AcceptsOneWidget getRightContent() {
    	return rightContent;
    }

    @Override
    public AcceptsOneWidget getFooter() {
    	return footer;
    }

}
