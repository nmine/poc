package be.nmine;

import org.glassfish.jersey.server.ResourceConfig;

public class Configuration extends ResourceConfig{

	public Configuration() {
		register(org.glassfish.jersey.server.filter.UriConnegFilter.class);
		register(org.glassfish.jersey.server.wadl.WadlFeature.class);
	}
}
