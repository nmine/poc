package be.nmine.designpatterns.behavioural.chainOfResponsability;

public class EmailClient {
    private EmailProcessor processor;

    public EmailClient() {
	createProcessor();

    }

    private void createProcessor() {
	processor = new EmailProcessor();
	processor.addHandler(new BusinessMailHandler());
	// processor.addHandler(new PersonalMailHandler());
    }

    public void addRule(EmailHandler handler) {
	processor.addHandler(handler);
    }

    // public void emailReceived(Email email) {
    // processor.handleRequest(email);
    // }

    public static void main(String[] args) {

	EmailClient client = new EmailClient();

    }

}
