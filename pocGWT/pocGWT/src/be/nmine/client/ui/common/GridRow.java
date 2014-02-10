package be.nmine.client.ui.common;


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class GridRow extends Composite {
	
	@UiField
	HTMLPanel content;
	
	@UiField
	Button closeLink;
	
	@UiField
	Button detailButton;
	
	
	
	
	interface GridRowUiBinder extends UiBinder<Widget, GridRow> {
	}

	private static GridRowUiBinder uiBinder = GWT
			.create(GridRowUiBinder.class);
	
	
	
	public GridRow() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setContent(String text) {
		content.add(new HTMLPanel(text));
	}

}
