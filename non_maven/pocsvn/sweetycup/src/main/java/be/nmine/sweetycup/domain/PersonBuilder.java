package be.nmine.sweetycup.domain;

public class PersonBuilder {
	private static final String DEFAULT_PHONE = "phone";
	private static final String DEFAULT_EMAIL = "email";
	private static final String DEFAULT_NAME = "name";
	private String name = DEFAULT_NAME;
	private String email = DEFAULT_EMAIL;
	private String phone = DEFAULT_PHONE;

	public Person build() {
		Person person = new Person();
		person.setEmail(email);
		person.setName(name);
		person.setPhone(phone);
		return person;
	}

	public PersonBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public PersonBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public PersonBuilder withPhone(String phone) {
		this.phone = phone;
		return this;
	}

}
