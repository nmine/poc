package be.nmine.pocreflection.proxy;



interface PersonI {
	String doSomething(String test);

	void initialize(String name, int size);
}

public class Person implements PersonI{
	private String name;
	
	private int size;
	@Override
	public void initialize(String name, int size) {
		this.name = name;
		this.size = size;
	}
	@Override
	public String doSomething(String test) {
		return test;
	}

}
