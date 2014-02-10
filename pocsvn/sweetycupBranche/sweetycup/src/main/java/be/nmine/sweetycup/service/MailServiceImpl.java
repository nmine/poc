package be.nmine.sweetycup.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import be.nmine.sweetycup.domain.MailMessage;

@Service
public class MailServiceImpl implements MailService {

	@Override
	public void send(MailMessage mailMessage) {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(
								"sweetycupform@gmail.com", "sweetycup");
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("sweetycupform@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("sweetycupreceiver@gmail.com"));
			message.setSubject("Nouvelle requête de Sweetycup");
			message.setText("sender : " + mailMessage.getEmail()
					+ " , content " + mailMessage.getContent());

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
}
