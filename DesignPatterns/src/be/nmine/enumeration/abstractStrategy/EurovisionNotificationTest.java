package be.nmine.enumeration.abstractStrategy;

import static org.junit.Assert.*;
import static be.nmine.enumeration.abstractStrategy.EurovisionNotification.*;
import org.junit.Test;

public class EurovisionNotificationTest {

	@Test
	public void notify_users_in_Baku_only() {
		assert(ONLY_IF_IN_MY_CITY.mustNotify("Baku", "BAKU"));
		assertFalse(ONLY_IF_IN_MY_CITY.mustNotify("Baku", "Paris"));
	}

}
