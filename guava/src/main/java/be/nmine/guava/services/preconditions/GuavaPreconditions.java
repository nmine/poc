package be.nmine.guava.services.preconditions;

import static com.google.common.base.Preconditions.checkNotNull;

public class GuavaPreconditions {
	public static void main(String[] args) {
		String test = null;
		//checkArgument(test != null);
		checkNotNull(test);
	}
}
