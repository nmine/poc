package be.nmine.pocjsni.client.views.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Style.Cursor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.TextBox;

public abstract class AbstractDateBox<T> extends Composite implements HasValue<T>, HasEnabled {

    @UiField
    protected DivElement dateDiv;
    @UiField
    protected TextBox dateTextBox;
    @UiField
    protected com.google.gwt.dom.client.Element dateIcon;
    @UiField
    protected com.google.gwt.dom.client.Element removeIconEl;
    @UiField
    protected Anchor removeIcon;
    private Listener listener;

    protected String startView = "decade";
    protected String minViewMode = "days";
    private final String format;

    @SuppressWarnings("rawtypes")
    public interface ViewUiBinder extends UiBinder<HTMLPanel, AbstractDateBox> {
    }

    protected ViewUiBinder uiBinder = GWT.create(ViewUiBinder.class);
    private HandlerRegistration clearFieldHandlerRegistration;

    public AbstractDateBox(String startView, String minViewMode, String formatForDatePicker) {
	format = formatForDatePicker;
	initWidget(uiBinder.createAndBindUi(this));
	dateTextBox.setReadOnly(true);
	this.startView = startView;
	this.minViewMode = minViewMode;

    }

    @Override
    protected void onLoad() {
	super.onLoad();

	// init datepicker
	setEnabled(isEnabled());
    }

    @Override
    public HandlerRegistration addValueChangeHandler(ValueChangeHandler<T> handler) {
	return addHandler(handler, ValueChangeEvent.getType());
    }

    @Override
    public T getValue() {
	try {
	    if (dateTextBox.getText() == null || dateTextBox.getText().isEmpty()) {
		return null;
	    }
	    return convertToObject(dateTextBox.getText());
	} catch (Exception e) {
	    return null;
	}
    }

    @Override
    public void setValue(T value) {
	setValue(value, false);
    }

    @Override
    public void setValue(T value, boolean fireEvents) {
	T oldDate = getValue();
	if (value != null) {
	    updateDatePicker(dateDiv, dateTextBox.getText());
	    dateTextBox.setText(convertToString(value));
	} else {
	    dateTextBox.setText("");
	}

	if (fireEvents) {
	    ValueChangeEvent.fireIfNotEqual(this, oldDate, value);
	}
    }

    @Override
    public boolean isEnabled() {
	return dateTextBox.isEnabled();
    }

    @Override
    public void setEnabled(boolean enabled) {
	dateTextBox.setEnabled(enabled);
	removeDatePicker(dateDiv);
	if (enabled) {
	    addBootstrapDatePicker(dateDiv, dateTextBox.getElement(), LocaleInfo.getCurrentLocale().getLocaleName());
	    dateIcon.getStyle().clearColor();
	    dateIcon.getStyle().clearCursor();
	    removeIconEl.getStyle().clearColor();
	    removeIconEl.getStyle().clearCursor();
	    clearFieldHandlerRegistration = removeIcon.addClickHandler(new ClickHandler() {
		@Override
		public void onClick(ClickEvent event) {
		    dateTextBox.setText("");
		}
	    });
	} else {
	    dateIcon.getStyle().setColor("gray");
	    dateIcon.getStyle().setCursor(Cursor.DEFAULT);
	    removeIconEl.getStyle().setColor("gray");
	    removeIconEl.getStyle().setCursor(Cursor.DEFAULT);
	    if (clearFieldHandlerRegistration != null) {
		clearFieldHandlerRegistration.removeHandler();
		clearFieldHandlerRegistration = null;
	    }
	}
    }

    native void addBootstrapDatePicker(DivElement element, Element inputElement, String language)/*-{
		$wnd
				.$(element)
				.datepicker(
						{
							language : language,
							startView : this.@be.nmine.pocjsni.client.views.widget.AbstractDateBox::startView,
							format : this.@be.nmine.pocjsni.client.views.widget.AbstractDateBox::format,
							minViewMode : this.@be.nmine.pocjsni.client.views.widget.AbstractDateBox::minViewMode,
							autoclose : true
						});

    }-*/;

    native void removeDatePicker(DivElement element) /*-{
		$wnd.$(element).datepicker('remove');
    }-*/;

    native void updateDatePicker(DivElement element, String dateValue) /*-{
		$wnd.$(element).datepicker('update', dateValue);
    }-*/;

    protected abstract T convertToObject(String value);

    protected abstract String convertToString(T value);

    public void setListener(Listener listener) {
	this.listener = listener;
    }

    public static interface Listener {
	public void eidCardReadyToUse();

	public void signaturePostFailureC2SUnreachable();

	public void signaturePostErrorValidatedAndExtendFailed();

	public void signaturePostErrorExpeditionDeleted();

	public void certValidationFailureC2SError();

	public void certValidationErrorNotANotary();

	public void certValidationErrorC2SUnreachable();

	public void signaturePostSuccessful();

	public void signatureCreationSuccessful();

	public void validatingEIDCardSignatureKey();

	public void eidCardError();

	public void eidCardInserted();

	public void waitingEIDCard();
    }

}
