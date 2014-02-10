package be.nmine.sweetycup.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import be.nmine.sweetycup.config.ApplicationContext;
import be.nmine.sweetycup.config.WebMvcConfiguration;
import be.nmine.sweetycup.domain.MailMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { ApplicationContext.class,
		WebMvcConfiguration.class })
public class MailServiceImplTest {

	@Autowired
	MailService mailService;

	@Test
	@Ignore
	public void testSend() {
		mailService.send(new MailMessage());
	}

}
