package utils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import be.nmine.pocja.domain.Cabin;
import be.nmine.pocja.domain.Ship;
import builder.CabinBuilder;
import builder.CruiseBuilder;
import builder.CustomerBuilder;
import builder.ReservationBuilder;
import builder.ShipBuilder;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class LoaderDBDatas {
    private static final String DEFAULT_SHIP_NAME = "ship1";

    @PersistenceContext
    private EntityManager entityManager;

    private CruiseBuilder cruiseBuilder;

    private CabinBuilder cabinBuilder;

    private CustomerBuilder customerBuilder;

    private ReservationBuilder reservationBuilder;

    private ShipBuilder shipBuilder;

    @Before
    public void setUp() {
	cruiseBuilder = new CruiseBuilder();
	cabinBuilder = new CabinBuilder();
	customerBuilder = new CustomerBuilder();
	reservationBuilder = new ReservationBuilder();
	shipBuilder = new ShipBuilder();
    }

    @Test
    @Transactional(readOnly = false)
    public void loadData() {
	Ship ship = shipBuilder.withName("ship1").withTonnage(1000).build();
	Cabin cabin = cabinBuilder.withBedCount(2).withDeskLevel(2).withName("cabin1").withShip(ship).build();
    }
}
