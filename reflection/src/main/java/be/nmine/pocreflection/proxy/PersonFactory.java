package be.nmine.pocreflection.proxy;


public class PersonFactory {
	private Class<?> PersonClass;
	private boolean traceIsOn = false;

	public PersonFactory(String className, boolean trace) {
		try {
			PersonClass = Class.forName(className);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e); // or whatever is appropriate
		}
		traceIsOn = trace;
	}

	public PersonI newInstance(String name, int size) {
		try {
			PersonI d = (PersonI) PersonClass.newInstance();
			d.initialize(name, size);
			if (traceIsOn) {
				d = (PersonI) ProxyFactory.createProxy(d);
			}
			return d;
		} catch (InstantiationException e) {
			throw new RuntimeException(e); // or whatever is appropriate
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e); // or whatever is appropriate
		}
	}
}
