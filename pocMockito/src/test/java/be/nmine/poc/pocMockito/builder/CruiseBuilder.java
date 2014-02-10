package be.nmine.poc.pocMockito.builder;

import be.nmine.poc.pocMockito.domain.Cruise;

public class CruiseBuilder {

    private static final String DEFAULT_NAME = "Cruise1";

    private String name = DEFAULT_NAME;

    public Cruise build() {
	Cruise cruise = new Cruise();
	cruise.setName(name);
	return cruise;
    }

    public CruiseBuilder withName(String name) {
	this.name = name;
	return this;
    }
}
