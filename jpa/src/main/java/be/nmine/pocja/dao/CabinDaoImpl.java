package be.nmine.pocja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import be.nmine.pocja.domain.Cabin;
import be.nmine.pocja.domain.Ship;

@Repository
public class CabinDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Cabin> getAllCabin() {
	return entityManager.createQuery("FROM Cabin", Cabin.class).getResultList();
    }

    public List<Cabin> getAllCabinOfShip(Ship ship) {
	return entityManager.createQuery("SELECT c.ship FROM Cabin as c INNER JOIN  Ship", Cabin.class).getResultList();
    }

    @Transactional
    public void saveCabin(Cabin cabin) {
	entityManager.persist(cabin);
    }
}
