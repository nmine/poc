package be.nmine.pocjsni.client.views.widget;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;

public class CustomDateBox extends AbstractDateBox<Date> {

    static final String DD_MM_YYYY = "dd-mm-yyyy";
    private static final DateTimeFormat DATE_FORMAT = DateTimeFormat.getFormat("dd-MM-yyyy");

    public CustomDateBox(String startView, String minViewMode) {
	super(startView, minViewMode, DD_MM_YYYY);
    }

    @Override
    protected String convertToString(Date value) {
	return DATE_FORMAT.format(value);
    }

    @Override
    protected Date convertToObject(String value) {
	return DATE_FORMAT.parse(value);
    }

}
