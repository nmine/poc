package be.nmine.guava;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;

public class MapTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() {
	// Map<String, String> map = Maps.newHashMap();
	// map.put(Country.POLAND.getName(), Country.POLAND.getCapitalCity());
	// map.put(Country.BELGIUM.getName(), Country.BELGIUM.getCapitalCity());
	// map.put(Country.SPAIN.getName(), Country.SPAIN.getCapitalCity());
	// map.put(Country.ENGLAND.getName(), Country.ENGLAND.getCapitalCity());
	//
	// Function<String, String> capitalCityFromCountryName = Functions.forMap(map);
	// assertEquals(Country.ENGLAND.getCapitalCity(), capitalCityFromCountryName.apply(Country.ENGLAND.getName()));
	assertEquals("", Strings.nullToEmpty(null));
	assertEquals("test", Strings.nullToEmpty("test").trim());
	String test = null;
	Strings.isNullOrEmpty(test);
	assertEquals("test", Optional.fromNullable(test).or("test").trim());
	List<String> strings = new ArrayList<String>();
	for (int i = 0; i < 10; i++) {
	    strings.add("" + i);
	}
	Iterable<String> iterable = strings;
	List<String> strings2 = new ArrayList<String>();
	strings2.add("tt");
	// strings2.clear();
	Iterables.addAll(strings2, iterable);

	String test3 = null;
	// class Person {
	// private String name;
	// private Date date;
	// private Date dateBirth;
	//
	// public Person() {
	// }
	//
	// }
	// assertEquals("", Optional.fromNullable(test).or(""));
	// test = "tt";
	// Function<Object, String> testFunction = new Function<Object, String>() {
	//
	// @Override
	// public String apply(Object arg0) {
	// // TODO Auto-generated method stub
	// return null;
	// }
	// };
    }

}
