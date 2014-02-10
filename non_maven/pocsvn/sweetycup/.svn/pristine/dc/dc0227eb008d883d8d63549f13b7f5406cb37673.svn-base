package be.nmine.sweetycup.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class SpringApplicationContextInitializer implements
		ApplicationContextInitializer<AnnotationConfigWebApplicationContext> {

	@Override
	public void initialize(
			AnnotationConfigWebApplicationContext applicationContext) {
		String profile= "server";
		applicationContext.getEnvironment().setActiveProfiles(profile);

		applicationContext.register(WebMvcConfiguration.class);
		applicationContext.refresh();

	}

}
