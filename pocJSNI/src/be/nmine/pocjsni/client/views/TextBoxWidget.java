package be.nmine.pocjsni.client.views;

import be.nmine.pocjsni.client.utils.JsniUtils;
import be.nmine.pocjsni.client.views.widget.BootstrapTextBox;
import be.nmine.pocjsni.client.views.widget.RichTextEditor;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class TextBoxWidget extends Composite {

    @UiField
    HTMLPanel htmlPanelDepositInfo;
    @UiField
    BootstrapTextBox textBox1;
    @UiField
    BootstrapTextBox textBox2;
    @UiField
    BootstrapTextBox textBox3;
    @UiField
    BootstrapTextBox textBox4;
    @UiField
    BootstrapTextBox textBox5;
    @UiField
    RichTextEditor richTextEditor;

    public interface ViewUiBinder extends UiBinder<HTMLPanel, TextBoxWidget> {
    }

    ViewUiBinder uiBinder = GWT.create(ViewUiBinder.class);

    public TextBoxWidget() {
	initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    protected void onLoad() {
	super.onLoad();
	htmlPanelDepositInfo.getElement().setId("htmlPanelId");
	JsniUtils.disableAllElementsFromParent(true, htmlPanelDepositInfo.getElement().getId());
	textBox1.enableToolTip(true);
    }
}
