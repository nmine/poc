package be.nmine.pocja.domain;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import java.util.Collection;
import java.util.List;

import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import be.nmine.pocja.dao.CabinDaoImpl;
import be.nmine.pocja.dao.ShipDaoImpl;
import builder.CabinBuilder;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class CabinDaoImplTest {

    @Autowired
    private CabinDaoImpl cabinDaoImpl;

    @Autowired
    private ShipDaoImpl shipDaoImpl;

    private CabinBuilder cabinBuilder;

    @Before
    public void setUp() throws Exception {
	cabinBuilder = new CabinBuilder();
    }

    @Test
    public void testGetAllCabin() {
	List<Cabin> cabins = cabinDaoImpl.getAllCabin();
	assertNotNull(cabins);
    }

    @Test
    public void getAllCabinOfAShipTest() {
	TypedQuery<Ship> ship = shipDaoImpl.getShipWithName(CabinBuilder.DEFAULT_NAME);
	Ship ship2 = ship.getSingleResult();
	Collection<Reservation> reservations = ship2.getReservations();
	assertTrue(!reservations.isEmpty());
	System.out.println();
    }

    @Test
    public void saveCabinTest() {
	cabinDaoImpl.saveCabin(cabinBuilder.build());
    }
}
