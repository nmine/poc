package be.nmine.pocjsni.client.views.widget;

import java.util.logging.Logger;

import be.nmine.pocjsni.client.utils.JsniUtils;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.Widget;

public abstract class AbstractBootstrapValueBox<W extends Widget & HasValue<T> & HasEnabled, T> extends Composite {

    @UiField(provided = true)
    String valueboxLabel;
    @UiField
    DivElement valueboxDiv;
    @UiField
    SpanElement valueboxErrorField;
    @UiField
    InlineLabel valueboxErrorFieldLabel;
    @UiField(provided = true)
    W valuebox;
    // bootstrap tool tip text from the XML UI
    String textToolTip = null;

    final Logger LOG = Logger.getLogger(this.getClass().getName());

    @SuppressWarnings("rawtypes")
    public interface ViewUiBinder extends UiBinder<HTMLPanel, AbstractBootstrapValueBox> {
    }

    protected ViewUiBinder uiBinder = GWT.create(ViewUiBinder.class);
    private String mask = null;
    protected boolean maskReverse = true;

    public AbstractBootstrapValueBox(W valueBox, String label) {
	this.valueboxLabel = label;
	this.valuebox = valueBox;
	initWidget(uiBinder.createAndBindUi(this));
	// adding ID to retrieve the value box and add it the toolTip
	valuebox.getElement().setId("valueboxDiv" + Random.nextInt());
    }

    public void setMask(String mask) {
	this.mask = mask;
    }

    public void setMaskReverse(boolean maskReverse) {
	this.maskReverse = maskReverse;
    }

    @Override
    protected void onLoad() {
	super.onLoad();
	if (mask != null) {
	    addMask(valuebox.getElement(), mask, maskReverse);
	}
    }

    public void setValue(T value) {
	valuebox.setValue(value);
    }

    public T getValue() {
	return valuebox.getValue();
    }

    public void setEnabled(boolean enabled) {
	valuebox.setEnabled(enabled);
    }

    protected native void addMask(Element element, String mask, boolean maskReverse)/*-{
		$wnd.$(element).mask(mask, {
			reverse : maskReverse
		});
    }-*/;

    public W getValuebox() {
	return valuebox;
    }

    public void setValue(T value, boolean fireEvents) {
	valuebox.setValue(value, fireEvents);
    }

    public boolean isEnabled() {
	return getValuebox().isEnabled();
    }

    // bind the xml property 'textToolTip' of the widget
    // necessary or error at start of the widget
    public void setTextToolTip(String textToolTip) {
	this.textToolTip = textToolTip;
    }

    public void enableToolTip(boolean enable) {
	if (enable)
	    JsniUtils.addToolTip(valuebox.getElement().getId(), textToolTip);
	else
	    JsniUtils.disableToolTip(valuebox.getElement().getId());
    }

}
