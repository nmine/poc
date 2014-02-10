package be.nmine.designpatterns.behavioural.chainOfResponsability;

public class BusinessMailHandler implements EmailHandler {
    private EmailHandler next;

    @Override
    public void setNext(EmailHandler handler) {
	next = handler;
    }

    @Override
    public void handleRequest(Email email) {
	if (/** !email.getFrom().endsWith("@businessaddress.com") */
	true) {
	    next.handleRequest(email);
	}

    }

}