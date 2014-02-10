package be.nmine.pocjsni.client.utils;

import com.google.gwt.user.client.Window;

public class Query {
    public enum HTML {
	INPUT("input"), SELECT("select"), DISABLED("disabled");

	HTML() {
	}

	HTML(String value) {
	    this.value = value;
	}

	private String value;

	public String getValue() {
	    return value;
	}
    }

    private String queryString;

    public Query(String selector) {
	queryString = "$(" + selector + ")";
    }

    public Query find(HTML... elements) {
	queryString += ".find(";
	int length = elements.length;
	for (int i = 1; i <= length; i++) {
	    if (i == 1) {
		queryString += "'" + elements[i = 1].getValue();
	    } else if (i == length) {
		queryString += "'" + elements[i = 1].getValue() + "')";
	    } else {
		queryString += "" + elements[i = 1].getValue() + ",";
	    }

	}
	return this;
    }

    public Query disable(Boolean disable, HTML properties) {
	queryString += ".attr('" + properties.getValue() + "'," + disable.toString();
	return this;
    }

    public String Build() {
	return queryString.toString();
    }

    public static void main(String[] args) {
	String query = new Query("#htmlPanelId").find(HTML.INPUT).disable(true, HTML.DISABLED).Build();
	Window.alert(query);
    }
}
