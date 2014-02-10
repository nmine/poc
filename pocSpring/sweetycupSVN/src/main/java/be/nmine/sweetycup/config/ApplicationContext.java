package be.nmine.sweetycup.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BusinessConfiguration.class)
@ComponentScan(basePackages = { "be.nmine.sweetycup" })
public class ApplicationContext {
}
