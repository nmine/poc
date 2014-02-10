package be.nmine.client.ui.impl;

import be.nmine.client.place.LeftContentPlace;
import be.nmine.client.place.RightContentPlace;
import be.nmine.client.place.HeaderPlace;
import be.nmine.client.ui.FooterView;

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

public class FooterViewImpl extends Composite implements FooterView {

	interface FooterViewImplUiBinder extends UiBinder<Widget, FooterViewImpl> {
	}

	private static FooterViewImplUiBinder uiBinder = GWT
			.create(FooterViewImplUiBinder.class);
	
	@UiField
    Button changeActivityButton;

	private Presenter presenter;

	public interface ViewUiBinder extends UiBinder<HTMLPanel, FooterViewImpl> {
	}

	public FooterViewImpl() {
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
	
	@UiHandler("changeActivityButton")
    void onChangeActivityButton(ClickEvent e) {
    	presenter.goTo(new LeftContentPlace(""));
    }

	@Override
	public void setWidget(IsWidget w) {
		// TODO Auto-generated method stub

	}
}
