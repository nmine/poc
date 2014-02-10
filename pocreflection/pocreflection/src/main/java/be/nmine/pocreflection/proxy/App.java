package be.nmine.pocreflection.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 * 
 */
public class App {
    static Logger LOG = LoggerFactory.getLogger("App");

    public static void main(String[] args) {
	// Person person = new Person();
	// PersonI action = (PersonI) ProxyFactory.createProxy(person);
	// LOG.info(""+action.doSomething("test"));

	PersonFactory factory = new PersonFactory("be.nmine.pocreflection.proxy.Person", true);
	PersonI personIProxy = factory.newInstance("Jonh Doe", 180);
	personIProxy.doSomething("test");

	// Stub proxy = StubIH.createStub(new Class<?>[] { PersonI.class }, null, null);
	// proxy.getHistory().
	// String response = proxy.doSomething("test");
	LOG.info("");
    }
}
