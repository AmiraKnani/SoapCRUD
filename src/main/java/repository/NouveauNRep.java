package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Camion;

public class NouveauNRep {
	
	private EntityManager em;

	public EntityManager getEm() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProjectSoap");
		em=emf.createEntityManager();
		return em;
	}
	
	public Camion findNN(int id) {
		return this.getEm().find(Camion.class, id);
	}
	
	public void addCamion(Camion camion) {
		EntityManager em = getEm();
		em.getTransaction().begin();
		em.persist(camion);
		em.getTransaction().commit();
		em.close();
	}
	
	public void deleteCamionById(int id) {
		EntityManager em = getEm();
		Camion camion = em.find(Camion.class, id);
		if (camion != null) {
			em.getTransaction().begin();
			em.remove(camion);
			em.getTransaction().commit();
		}
		em.close();
	}
	
	public List<Camion> getAllCamions() {
		EntityManager em = getEm();
		TypedQuery<Camion> query = em.createQuery("SELECT c FROM Camion c", Camion.class);
		List<Camion> camions = query.getResultList();
		em.close();
		return camions;
	}
	
	public void updateCamionById(int id, Camion newCamion) {
		EntityManager em = getEm();
		Camion camion = em.find(Camion.class, id);
		if (camion != null) {
			em.getTransaction().begin();
			camion.setCategorie(newCamion.getCategorie());
			camion.setDistance(newCamion.getDistance());
			camion.setPoid(newCamion.getPoid());
			em.getTransaction().commit();
		}
		em.close();
	}

}
