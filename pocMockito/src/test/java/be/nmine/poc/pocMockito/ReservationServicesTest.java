package be.nmine.poc.pocMockito;

import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import be.nmine.poc.pocMockito.domain.Reservation;
import be.nmine.poc.pocMockito.services.ReservationService;
import be.nmine.poc.pocMockito.services.ReservationServiceImpl;
import be.nmine.poc.pocMockito.utils.ReservationsUtils;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ReservationsUtils.class)
public class ReservationServicesTest {

    // TODO test Paramzriez tests
    // @RunWith(Parameterized.class)
    // public class CheckConsistencyEnterpriseNameTest extends AbstractCheckDepositTest {
    //
    // @Parameters
    // public static Collection<Object[]> languages() {
    // return Arrays.asList(new Object[][] { { Language.FR }, { Language.DE }, { Language.NL } });
    // }
    @SuppressWarnings("deprecation")
    @Test
    public void testReservationServiceWithMochStaticReservationUtils() {
		ReservationService reservationService = new ReservationServiceImpl();
		PowerMockito.mockStatic(ReservationsUtils.class);
		when(ReservationsUtils.returnReservationAmount(Matchers.any(Reservation.class))).thenReturn(Matchers.anyFloat());
		assertNotNull(reservationService.getReservationAmount(new Reservation()));
    }

}
