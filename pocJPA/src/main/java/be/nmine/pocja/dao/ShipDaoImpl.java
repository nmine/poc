package be.nmine.pocja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import be.nmine.pocja.domain.Ship;

@Repository
public class ShipDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Ship> getAllShip() {
	return entityManager.createQuery("FROM Ship", Ship.class).getResultList();
    }

    public TypedQuery<Ship> getShipWithName(String name) {
	return entityManager.createQuery("SELECT c FROM Ship as c WHERE c.name = '" + name + "'", Ship.class);
    }

    // public TypedQuery<Ship> getShipWithName(String name) {
    // return entityManager.createQuery("SELECT c FROM Ship as c WHERE c.name = '" + name + "'", Ship.class);
    // }
}
