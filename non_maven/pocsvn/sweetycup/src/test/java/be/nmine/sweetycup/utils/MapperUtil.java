package be.nmine.sweetycup.utils;

import be.nmine.sweetycup.domain.Person;
import be.nmine.sweetycup.domain.PersonBuilder;

import com.google.gson.Gson;

public class MapperUtil {
	public static void main(String[] args) {
		String personJSON  = new Gson().toJson(new PersonBuilder().build());
		Person person2 = new Gson().fromJson(personJSON,Person.class);
		System.out.println(personJSON);
		System.out.println(person2.getEmail());
	}
}
