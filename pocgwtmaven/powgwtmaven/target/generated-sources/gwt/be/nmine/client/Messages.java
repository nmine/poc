package be.nmine.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	D:/software/Dropbox/info/personalProjects/git/poc/pocgwtmaven/powgwtmaven/src/main/resources/be/nmine/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Enter your name".
   * 
   * @return translated "Enter your name"
   */
  @DefaultMessage("Enter your name")
  @Key("nameField")
  String nameField();

  /**
   * Translated "Send".
   * 
   * @return translated "Send"
   */
  @DefaultMessage("Send")
  @Key("sendButton")
  String sendButton();
}
