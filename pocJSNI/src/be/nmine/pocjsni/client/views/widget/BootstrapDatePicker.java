package be.nmine.pocjsni.client.views.widget;

import java.util.Date;

import com.google.gwt.uibinder.client.UiConstructor;

public class BootstrapDatePicker extends AbstractBootstrapValueBox<CustomDateBox, Date> {

    @UiConstructor
    public BootstrapDatePicker(String label, String startView, String minViewMode) {
	super(new CustomDateBox(startView, minViewMode), label);
    }

}
