package be.nmine.guava.services.Orderings;

import java.util.ArrayList;
import java.util.Collection;

import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

public class OrderingTest {
	public static void main(String[] args) {
		Collection< String> strings = new ArrayList<String>();
		strings.add("aaa");
		strings.add("a");
		strings.add("aa");
		strings.add("aaaaaa");
		strings.add("aaaa");
		strings.add(null);
		Ordering<String> byLengthOrdering = new Ordering<String>() {
		     public int compare(String left, String right) {
		       return Ints.compare(left.length(), right.length());
		     }
		   };

		   Collection< String> strings2 = Ordering.from(byLengthOrdering).natural().reverse().nullsFirst().sortedCopy(strings);
		   for(String s : strings2) {
			   System.out.println(s);
		   }
	}
}
